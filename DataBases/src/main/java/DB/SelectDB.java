package DB;

import extensions.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDB {

    public static void main(String[] args) {
        System.out.println("Connecting to DB course...");
        try (Connection connection = DriverManager.getConnection(Config.DB_URL, Config.user, Config.password))
        {
            System.out.println("Connected successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
