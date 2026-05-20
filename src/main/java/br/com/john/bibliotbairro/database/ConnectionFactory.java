package br.com.john.bibliotbairro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3307/biblioteca?verifyServerCertificate=false&SSL=true\"";
    private static final String USER = "root";
    private static final String PASSWORD = "Amora@1221";

    public static Connection getConnection() throws SQLException{
            return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
