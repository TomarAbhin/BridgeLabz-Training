package dao;

import util.DbConnection;
import java.sql.*;

public class AppointmentDao {

    public void bookAppointment(int patientId, int doctorId,
                                String appointment_date, String appointment_time) throws Exception {

        String sql = """
            INSERT INTO appointments(patient_id, doctor_id, appointment_date, appointment_time, status)
            VALUES(?,?,?,?, 'SCHEDULED')
        """;

        try (Connection con = DbConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, patientId);
            ps.setInt(2, doctorId);
            ps.setString(3, appointment_date);
            ps.setString(4, appointment_time);

            ps.executeUpdate();
            System.out.println("Appointment booked successfully");
        }
    }
}
