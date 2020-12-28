package tacnhan;

import java.sql.Date;

public class Account {
    private String maNV;
    private String tenTK;
    private String pass;
    private Date ngaySinh;
    private String ten;
    private String chucvu;
    private String sdt;
    public Account() {
    }

    public Account(String maNV, String tenTK, String pass, Date ngaySinh, String ten, String chucvu, String sdt) {
        this.maNV = maNV;
        this.tenTK = tenTK;
        this.pass = pass;
        this.ngaySinh = ngaySinh;
        this.ten = ten;
        this.chucvu = chucvu;
        this.sdt = sdt;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
