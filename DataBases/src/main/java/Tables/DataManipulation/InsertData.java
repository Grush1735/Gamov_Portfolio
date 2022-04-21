package Tables.DataManipulation;

import extensions.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(Config.DB_URL, Config.user, Config.password);
             Statement statement = connection.createStatement())
        {   String sql = "INSERT INTO students VALUES (1, 'Gamov Vladislav Valerievich', 1);";
            statement.executeUpdate(sql);
            System.out.println("Data inserted into table successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
