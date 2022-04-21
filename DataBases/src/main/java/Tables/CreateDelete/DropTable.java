package Tables.CreateDelete;

import extensions.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(Config.DB_URL, Config.user, Config.password);
             Statement statement = connection.createStatement())
        {   String sql = "DROP TABLE students";
            statement.executeUpdate(sql);
            System.out.println("Table dropped successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
