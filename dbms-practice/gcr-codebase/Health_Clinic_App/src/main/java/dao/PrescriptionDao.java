package dao;

import util.DbConnection;
import java.sql.*;

public class PrescriptionDao {

    public void addPrescription(int visitId,
                                String medicine,
                                String dosage,
                                int days) throws Exception {

        String sql = """
            INSERT INTO prescriptions(visit_id, medicine, dosage, duration)
            VALUES(?,?,?,?)
        """;

        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, visitId);
            ps.setString(2, medicine);
            ps.setString(3, dosage);
            ps.setInt(4, days);

            ps.executeUpdate();
            System.out.println("Prescription added");
        }
    }
}
