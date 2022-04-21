import DB.CreateDB;
import Tables.CreateDelete.CreateTable;
import Tables.CreateDelete.CreateTableBuilder;
import Tables.DataManipulation.InsertDataTransaction;

import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {
        CreateTableBuilder builder = new CreateTableBuilder();
        String DB = "course";
        CreateDB.create(DB);
        CreateTable.create(DB,"students",builder.addPrimary("id").addVarchar("username", 50, true).addInt("group_id", true).build());
        CreateTable.create(DB,"registration",builder.addPrimary("id").addVarchar("course_name", 50, true).build());
        InsertDataTransaction.add(DB ,1, "Test Test First", 1, "Java Automation course");
        InsertDataTransaction.add(DB ,2, "Test Test Second", 1, "Java Automation course");
        InsertDataTransaction.add(DB ,3, "Test Test Third", 2, "Java Automation course");
        InsertDataTransaction.add(DB ,4, "Test Test Fourth", 2, "Java Automation course");
        InsertDataTransaction.add(DB ,5, "Test Test Fifth", 2, "Java Automation course");
    }
}