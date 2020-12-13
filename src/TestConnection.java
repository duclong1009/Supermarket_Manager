
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("duclong1009");
        ds.setServerName("ADMIN\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("QLBongDa");

        try(Connection conn = ds.getConnection()) {
            System.out.println("ok");
        }
        catch (SQLServerException throwable ) {
            throwable.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
