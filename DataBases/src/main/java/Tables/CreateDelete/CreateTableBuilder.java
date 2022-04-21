package Tables.CreateDelete;

public class CreateTableBuilder {

    CreateTableBuilder builder = new CreateTableBuilder();

    String sql = "(\n";

    public CreateTableBuilder addPrimary(String table){
        sql += "\t" + table + "serial PRIMARY KEY,\n";
        return this;
    }

    public CreateTableBuilder addVarchar(String table, int symbols, boolean NotNull){
        sql += "\t" + table + "VARCHAR ( " + symbols + " NOT NULL ),\n";
        return this;
    }

    public CreateTableBuilder addInt(String table, boolean NotNull){
        sql += "\t" + table + "int NOT NULL ),\n";
        return this;
    }

    public String build(){
        return sql+= "\");\"";
    }
}
