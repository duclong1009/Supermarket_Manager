import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public Connection getConnect(String database, String user, String password) {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbURL = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName="+database+";"
                    + "integratedSecurity=true";
            conn = DriverManager.getConnection(dbURL, user, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}

