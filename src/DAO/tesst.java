package DAO;

import tacnhan.SanPham;

import java.sql.Date;
import java.sql.SQLException;


public class tesst {
    public static void main(String[] args) {
        SP_Dao s = new SP_Dao();
        java.sql.Date d = new Date(2020,4,12);
        java.sql.Date d2 = new Date(2020,4,30);
        SanPham sp = new SanPham("2222","Durex","2000",d,d2,2000,"Kho",200,2000);
        try {
            s.insert(sp);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
