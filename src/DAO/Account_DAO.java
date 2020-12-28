package DAO;

import Data.ConnectDB;
import Data.Query;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import tacnhan.Account;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Account_DAO implements  Dao<Account>{
    ResultSet rs;
    Connection conn;
    public  Account_DAO() {
        conn = new ConnectDB().getConnect("Sieuthi","sa","duclong1009");
    }
    @Override
    public ObservableList<Account> getAll() throws SQLException {
        rs = new Query().setQuery(conn,"select * from Account");
        ObservableList<Account> res = FXCollections.observableArrayList();
        while(rs.next()) {
            Account tmp = new Account();
            tmp.setMaNV(rs.getString(1));
            tmp.setTenTK(rs.getString(2));
            tmp.setPass(rs.getString(3));
            tmp.setNgaySinh(rs.getDate(4));
            tmp.setTen(rs.getString(5));
            tmp.setSdt(rs.getString(6));
            tmp.setChucvu(rs.getString(7));
            res.add(tmp);
        }
        return res;
    }

    @Override
    public void update(Account entrie) {
        PreparedStatement stmt = conn.prepareStatement("update Account set ")
    }

    @Override
    public List<Account> getList() {
        return null;
    }

    @Override
    public void insert(Account ac) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("insert into Account values (?,?,?,?,?,?,?)");
        stmt.setString(1,ac.getMaNV());
        stmt.setString(2,ac.getMaNV());
        stmt.setString(3,ac.getPass());
        stmt.setDate(4,ac.getNgaySinh());
        stmt.setString(5,ac.getTen());
        stmt.setString(6,ac.getSdt());
        stmt.setString(7,ac.getChucvu());
        stmt.executeUpdate();
    }

    @Override
    public void delete(Account entrie) {

    }
}
