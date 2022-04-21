package Tables.CreateDelete;

import extensions.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void create(String database, String TableName,String sql){
        try (Connection connection = DriverManager.getConnection(Config.server_URL + "/" + database, Config.user, Config.password);
             Statement statement = connection.createStatement())
        {   statement.executeUpdate("CREATE TABLE " + TableName + ' ' + sql);
            System.out.println("Table created successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
