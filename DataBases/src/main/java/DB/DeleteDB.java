package DB;

import extensions.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDB {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(Config.server_URL, Config.user, Config.password);
             Statement statement = connection.createStatement())
        {
            String sql = "DROP DATABASE course";
            statement.executeUpdate(sql);
            System.out.println("DB dropped successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
