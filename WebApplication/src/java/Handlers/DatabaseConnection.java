/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eric Ong
 */
public class DatabaseConnection {

    private static DatabaseConnection singleton;
    private Connection conn;

    public DatabaseConnection() {

    }

    public static DatabaseConnection getSingleton() {
        if (singleton == null) {
            singleton = new DatabaseConnection();
        }
        return singleton;
    }
    
    public Connection getConnection() {
        return conn;
    }
    
    public void connectToDB() {
        try {
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://localhost/mydb";
            //  Database credentials
            final String USER = "root";
            final String PASS = "12345";

            // Register JDBC driver
            System.out.println("Finding Driver");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Found");
            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection Successful");
        } catch (Exception e) {
            System.out.println("Connection Failed. . .");
        }
    }

    public void closeConnection() {
        try {
            System.out.println("Closing Connection");
            if (conn != null) {
                conn.close();
            } else
                System.out.println("No connection to close.");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
