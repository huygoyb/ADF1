package entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Order {
    public String maSanPham;
    public String fullName;
    public String tenSanPham;
    public Float tongTien;
    public Date ngayTao;
    public String donHanng;

    public String toString(){
        return String.format("%10s%10s%10s  | %10s%10s%10s  |  %10s%10s%10s  | %10s%10s%10s   |  %10s%10s%10s\n",
                "",maSanPham,"",
                "",fullName,"",
                "",tenSanPham,"",
                "",tongTien,"",
                "",ngayTao,"");
    }
    public Order() {
    }

    public Order(String maSanPham, String fullName, String tenSanPham, Float tongTien, Date ngayTao, String donHanng) {
        this.maSanPham = maSanPham;
        this.fullName = fullName;
        this.tenSanPham = tenSanPham;
        this.tongTien = tongTien;
        this.ngayTao = Calendar.getInstance().getTime();
        this.donHanng = donHanng;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Float getTongTien() {
        return tongTien;
    }

    public void setTongTien(Float tongTien) {
        this.tongTien = tongTien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getDonHanng() {
        return donHanng;
    }

    public void setDonHanng(String donHanng) {
        this.donHanng = donHanng;
    }
}
