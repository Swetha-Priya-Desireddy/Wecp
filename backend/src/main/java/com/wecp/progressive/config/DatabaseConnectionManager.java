package com.wecp.progressive.config;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    public static void loadProperties() throws SQLException
    {
        Connection connection=DriverManager.getConnection(null);
    }

}
