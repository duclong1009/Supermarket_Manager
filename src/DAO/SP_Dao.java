package DAO;

import Data.ConnectDB;
import Data.Query;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import tacnhan.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SP_Dao implements  Dao<SanPham>{
    ResultSet rs;
    Connection conn;
    public SP_Dao (){
        conn = new ConnectDB().getConnect("Sieuthi","sa","duclong1009");

    }
    @Override
    public ObservableList<SanPham> getAll() throws SQLException {
        rs = new Query().setQuery(conn,"select * from SanPham");
        ObservableList<SanPham> res = FXCollections.observableArrayList();
        while(rs.next()) {
            SanPham tmp = new SanPham();
            tmp.setMaSP(rs.getString(1));
            tmp.setTenSP(rs.getString(2));
            tmp.setMaNCC(rs.getString(3));
            tmp.setNgayNhap(rs.getDate(4));
            tmp.setHSD(rs.getDate(5));
            tmp.setSoLuong(rs.getInt(6));
            tmp.setVitri(rs.getString(7));
            tmp.setGiaNhap(rs.getInt(8));
            tmp.setGiaBan(rs.getInt(9));
            res.add(tmp);
        }
        return res;
    }

    @Override
    public void update(SanPham entries) {

    }

    @Override
    public List<SanPham> getList(  ) {
        return null;
    }

    @Override
    public void insert(SanPham sp) throws  SQLException{
        PreparedStatement stmt = conn.prepareStatement("insert into SanPham values (?,?,?,?,?,?,?,?,?)");
        stmt.setString(1,sp.getMaSP());
        stmt.setString(2,sp.getTenSP());
        stmt.setString(3,sp.getMaNCC());
        stmt.setDate(4,sp.getNgayNhap());
        stmt.setDate(5,sp.getHSD());
        stmt.setInt(6,sp.getSoLuong());
        stmt.setString(7,sp.getVitri());
        stmt.setInt(8,sp.getGiaNhap());
        stmt.setInt(9,sp.getGiaBan());
        stmt.executeUpdate();
    }

    @Override
    public void delete(SanPham entries) {

    }
}