package Data;

import java.sql.Connection;
import java.sql.ResultSet;

public class main {
    public static void main(String[] args) {
        Connection s = new ConnectDB().getConnect("QLBongDa","sa","duclong1009");
//        ResultSet rs = new Query().setQuery(s,"hihi");
    }
}
