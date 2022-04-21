package DB;

import extensions.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {

    public static void create(String name) {
        try (Connection connection = DriverManager.getConnection(Config.server_URL, Config.user, Config.password);
             Statement statement = connection.createStatement())
        {
            String sql = "CREATE DATABASE " + name;
            statement.executeUpdate(sql);
            System.out.println("Table " + name + "created successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
