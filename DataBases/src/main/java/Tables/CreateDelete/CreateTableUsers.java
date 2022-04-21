package Tables.CreateDelete;

import extensions.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableUsers {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(Config.DB_URL, Config.user, Config.password);
             Statement statement = connection.createStatement())
        {   String sql = "CREATE TABLE students (\n" +
                "\tid serial PRIMARY KEY,\n" +
                "\tusername VARCHAR ( 50 ) UNIQUE NOT NULL,\n" +
                "\tgroup_id int not null \n" +
                ");";
            statement.executeUpdate(sql);
            System.out.println("Table created successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
