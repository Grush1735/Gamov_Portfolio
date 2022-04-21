package Tables.DataManipulation;

import extensions.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(Config.DB_URL, Config.user, Config.password);
             Statement statement = connection.createStatement())
        {   String sql = "DELETE FROM students where id = 1;";
            statement.executeUpdate(sql);
            System.out.println("Record was deleted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
