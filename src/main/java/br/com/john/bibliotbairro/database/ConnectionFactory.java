package br.com.john.bibliotbairro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost/database_aqui?verifyServerCertificate=false&SSL=true\"";
    private static final String USER = "user";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException{
            return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
