import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class ConnectSQLServerExample {
    private static String DB_URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=QLBongDa;"
            + "integratedSecurity=true";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "duclong1009";

    public static Connection getConnection(String dbURL, String userName,
                                           String password) {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }

    public static void main(String[] args) {
        try {
            // connnect to database 'testdb'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
            // crate statement
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            ResultSet rs = stmt.executeQuery("select * from CAUTHU");
            // show data
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2)
                        + "  " + rs.getString(3)+"   "+ rs.getString(4));
            }
        }
         catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

