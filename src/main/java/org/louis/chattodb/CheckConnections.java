package org.louis.chattodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckConnections {

    public static void CheckMySQLConnectionShadow(String url, String username, String password) {
        try {
            Class.forName("shadow.com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.getMessage();
        }

    }
    public static void CheckMySQLConnectionNormal(String url, String username, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.getMessage();
        }

    }
    public static void CheckMySQLConnectionSlash(String url, String username, String password) {
        try {
            Class.forName("com/mysql/jdbc/Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.getMessage();
        }
    }




}
