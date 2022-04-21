package Tables.DataManipulation;

import extensions.Config;

import java.sql.*;

public class UpdateData {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(Config.DB_URL, Config.user, Config.password);
             Statement statement = connection.createStatement())
        {   String sql = "UPDATE students SET group_id = 2 where id = 1;";
            statement.executeUpdate(sql);
            System.out.println("Table was updated successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
