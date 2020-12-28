package tacnhan;

import java.sql.Date;

public class SanPham {
    private  String maSP;
    private  String tenSP;
    private String maNCC;
    private Date ngayNhap;
    private Date HSD;
    private int soLuong;
    private String vitri;
    private int giaNhap;
    private  int giaBan;
    public SanPham(){}
    public SanPham(String maSP, String tenSP, String maNCC, Date ngayNhap, Date HSD, int soLuong, String vitri, int giaNhap, int giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.maNCC = maNCC;
        this.ngayNhap = ngayNhap;
        this.HSD = HSD;
        this.soLuong = soLuong;
        this.vitri = vitri;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }


    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public Date getHSD() {
        return HSD;
    }

    public void setHSD(Date HSD) {
        this.HSD = HSD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
}
