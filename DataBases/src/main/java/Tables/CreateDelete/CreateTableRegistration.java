package Tables.CreateDelete;

import extensions.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableRegistration {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(Config.DB_URL, Config.user, Config.password);
             Statement statement = connection.createStatement())
        {   String sql = "CREATE TABLE registration (\n" +
                "\tid serial PRIMARY KEY,\n" +
                "\tcourse_name VARCHAR ( 50 ) NOT NULL\n" +
                ");";
            statement.executeUpdate(sql);
            System.out.println("Table created successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
