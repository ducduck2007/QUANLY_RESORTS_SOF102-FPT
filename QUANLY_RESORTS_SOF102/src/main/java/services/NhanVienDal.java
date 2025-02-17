/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.NhanVien;

/**
 *
 * @author Admin
 */
public class NhanVienDal{
    public List<NhanVien> findAll(){
        String sql = "select * from NhanVien";
        List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            Connection con = DataProvider.dataConnection();
            PreparedStatement preStm = con.prepareCall(sql);
            ResultSet rs = preStm.executeQuery();
            while(rs.next()){
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNV(rs.getString("maNV"));
                nhanVien.setTenNV(rs.getString("tenNV"));
                nhanVien.setGioiTinh(rs.getString("gioiTinh"));
                nhanVien.setEmail(rs.getString("email"));
                nhanVien.setLich(rs.getInt("lich"));
                list.add(nhanVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public NhanVien findId(String maNV){
        String sql = "select * from NhanVien where maNV = ?";
        try {
            Connection con = DataProvider.dataConnection();
            PreparedStatement preStm = con.prepareCall(sql);
            preStm.setString(1, maNV);
            ResultSet rs = preStm.executeQuery();
            if(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("maNV"));
                nv.setTenNV(rs.getString("TenNV"));
                nv.setGioiTinh(rs.getString("gioiTinh"));
                nv.setEmail(rs.getString("email"));
                nv.setLich(rs.getInt("lich"));
                return nv;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean insert(NhanVien nv){
        String sql = "insert into NhanVien values(?,?,?,?,?)";
        try {
            Connection con = DataProvider.dataConnection();
            PreparedStatement preStm = con.prepareCall(sql);
            preStm.setString(1, nv.getMaNV());
            preStm.setString(2, nv.getTenNV());
            preStm.setString(3, nv.getGioiTinh());
            preStm.setString(4, nv.getEmail());
            preStm.setInt(5, nv.getLich());
            return preStm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean update(NhanVien nv){
        String sql = "update NhanVien set tenNV = ?, gioiTinh = ?, email = ?, lich = ? where maNV = ?";
        try {
            Connection con = DataProvider.dataConnection();
            PreparedStatement preStm = con.prepareCall(sql);
            preStm.setString(1, nv.getTenNV());
            preStm.setString(2, nv.getGioiTinh());
            preStm.setString(3, nv.getEmail());
            preStm.setInt(4, nv.getLich());
            preStm.setString(5, nv.getMaNV());
            return preStm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean delete(String maNV){
        String sql = "delete from NhanVien where maNV = ?";
        try {
            Connection con = DataProvider.dataConnection();
            PreparedStatement preStm = con.prepareCall(sql);
            preStm.setString(1, maNV);
            return preStm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
