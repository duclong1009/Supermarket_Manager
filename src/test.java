import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws SQLException {
        Connection ronn = new ConnectDB().getConnect("QLBongDa","sa","duclong1009");
        String query = "Select* from CAUTHU";
        var rs = new Query().setQuery(ronn, query);
        while(rs.next()) {
            System.out.println(rs.getString(1) + "  " + rs.getString(2)
                    + "  " + rs.getString(3)+"   "+ rs.getString(4));
        }
    }
}
