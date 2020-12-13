
import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.ResultSet;
        import java.sql.SQLException;

public class Connect {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QlBongDa";// your db name
            String user="sa"; // your db username
            String password="duclong"; // your db password
            String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
                    "databaseName=QLBongDa;username=sa;password=duclong1009;";
            Connection conn = DriverManager.getConnection(url, user, password);
            if(conn != null){
                System.out.println("Connect success!");
            }

            var sql = "select * from dbo.Student";
            var statement = conn.prepareStatement(sql);
            var resultSet = statement.executeQuery();
            showResutl(resultSet);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void showResutl(ResultSet resultSet) throws SQLException {
        System.out.printf("%-6s%-20s%-15s%-30s%-20s%-10s%-20s\n", "ID",
                "Full Name", "Address", "Email",
                "Date of birth", "Gender", "Phone");
        while (resultSet.next()){
            var id = resultSet.getInt("MACT");
            var hoten = resultSet.getString("HOTEN");
            var Vitri = resultSet.getString("VITRI");
            var NgaySinh = resultSet.getString("NGAYSINH");
            var Diachi = resultSet.getDate("DIACHI");
            var MaClb = resultSet.getString("MACLB");
            var MaQg = resultSet.getString("MAQG");
            var so = resultSet.getString("SO");

            System.out.printf("%-6d%-20s%-15s%-30s%-20s%-10s%-10s%-20s\n", id, hoten,
                    Vitri, NgaySinh, Diachi, MaClb, MaQg,so);
        }
    }
}
