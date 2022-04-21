package Tables.Selects;

import extensions.Config;
import extensions.SQLBuilder;

import java.sql.*;

public class SelectFromTableSort {

    public static void main(String[] args) {
        SQLBuilder builder = new SQLBuilder();
        try (Connection connection = DriverManager.getConnection(Config.DB_URL, Config.user, Config.password);
             Statement statement = connection.createStatement())
        {   String sql = builder.selectAll().from("students").wherelike("username", "%Vlad%").orderby("id").build();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()){
                System.out.println("{");
                System.out.println("\tid:" + result.getInt("id"));
                System.out.println("\tName:" + result.getString("username"));
                System.out.println("\tgroup:" + result.getInt("group_id"));
                System.out.println("}");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
