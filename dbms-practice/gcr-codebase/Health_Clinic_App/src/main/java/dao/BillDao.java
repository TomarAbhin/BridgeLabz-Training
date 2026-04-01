package dao;

import java.sql.*;

public class BillDao {

    public void generateBill(Connection con, int visitId) {
        try {
      
            String feeQuery =
                    "SELECT d.consultation_fee " +
                    "FROM visits v " +
                    "JOIN appointments a ON v.appointment_id = a.id " +
                    "JOIN doctors d ON a.doctor_id = d.id " +
                    "WHERE v.id = ?";

            PreparedStatement ps1 = con.prepareStatement(feeQuery);
            ps1.setInt(1, visitId);

            ResultSet rs = ps1.executeQuery();

            if (!rs.next()) {
                System.out.println("Visit not found!!");
                return;
            }

            double amount = rs.getDouble("consultation_fee");

            String insertBill =
                    "INSERT INTO bills (visit_id, amount, payment_status) " +
                    "VALUES (?, ?, ?)";

            PreparedStatement ps2 = con.prepareStatement(insertBill);
            ps2.setInt(1, visitId);
            ps2.setDouble(2, amount);
            ps2.setString(3, "UNPAID");

            ps2.executeUpdate();

            System.out.println("Bill Generated Successfully: ");
            System.out.println("Amount: " + amount);
            System.out.println("Status: UNPAID");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void payBill(Connection con, int billId, String mode) {
        try {
            String update =
                    "UPDATE bills " +
                    "SET payment_status='PAID', payment_date=CURDATE(), payment_mode=? " +
                    "WHERE id=?";

            PreparedStatement ps = con.prepareStatement(update);
            ps.setString(1, mode);
            ps.setInt(2, billId);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Payment Successful");
            else
                System.out.println("Bill not found!!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showBill(Connection con, int visitId) {
        try {
            String query =
                    "SELECT id, amount, payment_status, payment_date, payment_mode " +
                    "FROM bills WHERE visit_id=?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, visitId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("Bill ID: " + rs.getInt("id"));
                System.out.println("Amount: " + rs.getDouble("amount"));
                System.out.println("Status: " + rs.getString("payment_status"));
                System.out.println("Payment Date: " + rs.getDate("payment_date"));
                System.out.println("Mode: " + rs.getString("payment_mode"));
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
