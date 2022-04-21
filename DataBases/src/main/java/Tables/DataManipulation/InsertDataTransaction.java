package Tables.DataManipulation;

import extensions.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataTransaction {

    public static void add(String database, int id, String FullName, int Group, String CourseName) throws SQLException {
        Connection connection = DriverManager.getConnection(Config.server_URL + "/" + database, Config.user, Config.password);
        try {
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO students VALUES (" + id + ", '" + FullName + "', " + Group + ");";
            statement.executeUpdate(sql);
            sql = "INSERT INTO registration VALUES (" + id + ", '" + CourseName + "');";
            statement.executeUpdate(sql);
            connection.commit();
            System.out.println("Data inserted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
            connection.rollback();
        } finally {
            connection.close();
        }
    }
}
