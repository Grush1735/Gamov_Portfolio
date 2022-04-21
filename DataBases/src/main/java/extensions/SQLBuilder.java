package extensions;

public class SQLBuilder {
    String sql;

    public SQLBuilder selectAll(){
        sql = "SELECT *";
        return this;
    }

    public SQLBuilder select(String columns){
        sql = "SELECT " + columns;
        return this;
    }

    public SQLBuilder from(String table){
        sql += " FROM " + table;
        return this;
    }

    public SQLBuilder where(String where){
        sql += " WHERE " + where;
        return this;
    }

    public SQLBuilder wherelike(String arg, String like){
        sql += " WHERE " + arg + " like '" + like + "'";
        return this;
    }

    public SQLBuilder orderby(String by){
        sql += " order by " + by;
        return this;
    }

    public SQLBuilder orderby(String by, boolean desc){
        sql += " order by " + by + "desc";
        return this;
    }

    public String build(){
        return sql;
    }
}
