package dao;

import util.DbConnection;
import java.sql.*;

public class DoctorDao {

    public void addDoctor(String name, int specialtyId,
                          String contact, double fee) throws Exception {

        String sql = "INSERT INTO doctors(name, specialization_id, contact, consultation_fee, is_active) VALUES(?,?,?,?,true)";

        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, specialtyId);
            ps.setString(3, contact);
            ps.setDouble(4, fee);

            ps.executeUpdate();
            System.out.println("Doctor added successfully");
        }
    }

    public void viewDoctorsBySpecialty(String specialtyName) throws Exception {

        String sql = """
            SELECT d.id, d.name, s.name AS specialty, d.consultation_fee
            FROM doctors d
            JOIN specialties s ON d.specialty_id = s.id
            WHERE s.name = ? AND d.is_active = true
        """;

        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, specialtyName);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("specialty") + " | " +
                    rs.getDouble("consultation_fee")
                );
            }
        }
    }
}
