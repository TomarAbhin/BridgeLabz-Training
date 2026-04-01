package util;

import java.sql.*;
import java.sql.DriverManager;

public class DbConnection {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/clinic";
        String user = "root";
        String password = "Soul@3107";
        return DriverManager.getConnection(url, user, password);
    }
}

