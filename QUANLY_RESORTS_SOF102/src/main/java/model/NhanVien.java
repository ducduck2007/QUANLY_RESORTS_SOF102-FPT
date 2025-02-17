/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class NhanVien {
    String maNV, tenNV, vaiTro, email;
    int lich;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String vaiTro, String email, int lich) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.vaiTro = vaiTro;
        this.email = email;
        this.lich = lich;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLich() {
        return lich;
    }

    public void setLich(int lich) {
        this.lich = lich;
    }
    
}
