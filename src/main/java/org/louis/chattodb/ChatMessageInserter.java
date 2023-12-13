package org.louis.chattodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ChatMessageInserter {





    private Connection connection;
    // ("jdbc:mysql://localhost:3306/test", "Admin", "ZoeHeimerdinger2004");

    public static String isMySQLServerAvailable(String url, String username, String password) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            connection.close();
            return "Erfolgreich";
        } catch (SQLException e) {
            return e.getMessage();
        }

    }



    public static void insertChatMessage(String username, String server, int Gamemode, int x, int y, int z, String message, String MinecraftVersion, String World) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded!");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "Client", "4Nm[]qeB$7!]dN5j");
            String sql = "INSERT INTO chat_messages (UserName, Server, Gamemode, X, Y, Z, Message, MinecraftVersion, World) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, server);
            statement.setInt(3, Gamemode);
            statement.setInt(4, x);
            statement.setInt(5, y);
            statement.setInt(6, z);
            statement.setString(7, message);
            statement.setString(8, MinecraftVersion);
            statement.setString(9, World);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
        }


    }

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test";
        String username = "dynmap";
        String password = "4Nm[]qeB$7!]dN5j";


        String result = isMySQLServerAvailable(url, username, password);
        insertChatMessage("Louis", "S", 0, 0, 0, 0, "Test Nachricht", "1.16.5", "world");

        System.out.println(result);

    }

}
