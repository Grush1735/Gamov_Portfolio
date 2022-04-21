import DB.CreateDB;
import Tables.DataManipulation.InsertDataTransaction;

import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {
        String DB = "course";
        CreateDB.create(DB);
        InsertDataTransaction.add(DB ,1, "Test Test First", 1, "Java Automation course");
        InsertDataTransaction.add(DB ,2, "Test Test Second", 1, "Java Automation course");
        InsertDataTransaction.add(DB ,3, "Test Test Third", 2, "Java Automation course");
        InsertDataTransaction.add(DB ,4, "Test Test Fourth", 2, "Java Automation course");
        InsertDataTransaction.add(DB ,5, "Test Test Fifth", 2, "Java Automation course");
    }
}
