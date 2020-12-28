package Data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Query {
    ResultSet rs = null;
    public ResultSet setQuery(Connection conn, String query){
        try{
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            rs = stmt.executeQuery(query);
            // show data
            System.out.println("setQuery successfully");
            return rs;

        }
        catch (
                SQLException throwables) {
            throwables.printStackTrace();
        }
        return rs;
    }

    public  static void  update(Connection conn, String query) throws SQLException{
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(query);
    }

    public static void main(String[] args) {

    }

}
