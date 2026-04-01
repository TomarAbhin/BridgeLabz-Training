package dao;

import util.DbConnection;
import java.sql.*;

public class VisitDao {

    public void recordVisit(int appointmentId,
                            String diagnosis,
                            String notes) throws Exception {

        Connection con = DbConnection.getConnection();
        con.setAutoCommit(false);

        try {
            String visitSql = """
                INSERT INTO visits(appointment_id, diagnosis, notes)
                VALUES(?,?,?)
            """;

            PreparedStatement ps1 = con.prepareStatement(visitSql);
            ps1.setInt(1, appointmentId);
            ps1.setString(2, diagnosis);
            ps1.setString(3, notes);
            ps1.executeUpdate();

            String updateSql = "UPDATE appointments SET status='COMPLETED' WHERE id=?";
            PreparedStatement ps2 = con.prepareStatement(updateSql);
            ps2.setInt(1, appointmentId);
            ps2.executeUpdate();

            con.commit();
            System.out.println("Visit recorded successfully");

        } catch (Exception e) {
            con.rollback();
            throw e;
        }
    }
}
