/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class StudentFpoly {

    private String maSV;
    private String ten;
    private String eMail;
    private String sDT;
    private int gioiTinh;
    private String diaChi;
    private String tenAnh;
    private double tA;
    private double tH;
    private double tC;
    private double tB;

    public StudentFpoly() {
    }

    public StudentFpoly(String maSV, String ten, String eMail, String sDT, int gioiTinh, String diaChi, String tenAnh) {
        this.maSV = maSV;
        this.ten = ten;
        this.eMail = eMail;
        this.sDT = sDT;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.tenAnh = tenAnh;
    }

    public StudentFpoly(String maSV, String ten, double tA, double tH, double tC, double tB) {
        this.maSV = maSV;
        this.ten = ten;
        this.tA = tA;
        this.tH = tH;
        this.tC = tC;
        this.tB = tB;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTenAnh() {
        return tenAnh;
    }

    public void setTenAnh(String tenAnh) {
        this.tenAnh = tenAnh;
    }

    public double gettA() {
        return tA;
    }

    public void settA(double tA) {
        this.tA = tA;
    }

    public double gettH() {
        return tH;
    }

    public void settH(double tH) {
        this.tH = tH;
    }

    public double gettC() {
        return tC;
    }

    public void settC(double tC) {
        this.tC = tC;
    }

    public double gettB() {
        return tB;
    }

    public void settB(double tB) {
        this.tB = tB;
    }

}
