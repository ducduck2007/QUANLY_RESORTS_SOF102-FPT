/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Phong {
    String maP;
    int soP;
    String loaiP;
    float giaP;

    public Phong() {
    }

    public Phong(String maP, int soP, String loaiP, float giaP) {
        this.maP = maP;
        this.soP = soP;
        this.loaiP = loaiP;
        this.giaP = giaP;
    }

    public String getMaP() {
        return maP;
    }

    public void setMaP(String maP) {
        this.maP = maP;
    }

    public int getSoP() {
        return soP;
    }

    public void setSoP(int soP) {
        this.soP = soP;
    }

    public String getLoaiP() {
        return loaiP;
    }

    public void setLoaiP(String loaiP) {
        this.loaiP = loaiP;
    }

    public float getGiaP() {
        return giaP;
    }

    public void setGiaP(float giaP) {
        this.giaP = giaP;
    }
    
}
