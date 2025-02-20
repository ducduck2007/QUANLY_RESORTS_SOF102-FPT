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
import model.Phong;

/**
 *
 * @author Admin
 */
public class PhongDal {
    public List<Phong> findAll(){
        String sql = "select * from DatPhong";
        try {
            Connection con = DataProvider.dataConnection();
            PreparedStatement pps = con.prepareCall(sql);
            ResultSet rs = pps.executeQuery();
            List<Phong> list = new ArrayList<>();
            while(rs.next()){
                Phong p = new Phong();
                p.setMaP(rs.getString("maP"));
                p.setSoP(rs.getInt("soP"));
                p.setLoaiP(rs.getString("loaiP"));
                p.setGiaP(rs.getFloat("giaP"));
                list.add(p);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Phong findId(String maP){
        String sql = "select * from DatPhong where maP = ?";
        try {
            Connection con = DataProvider.dataConnection();
            PreparedStatement pps = con.prepareCall(sql);
            pps.setString(1, maP);
            ResultSet rs = pps.executeQuery();
            if(rs.next()){
                Phong p = new Phong();
                p.setMaP(rs.getString("maP"));
                p.setSoP(rs.getInt("soP"));
                p.setLoaiP(rs.getString("loaiP"));
                p.setGiaP(rs.getFloat("giaP"));
                return p;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean insert(Phong p){
        String sql = "insert into DatPhong values(?,?,?,?)";
        try {
            Connection con = DataProvider.dataConnection();
            PreparedStatement pps = con.prepareCall(sql);
            pps.setString(1, p.getMaP());
            pps.setInt(2, p.getSoP());
            pps.setString(3, p.getLoaiP());
            pps.setFloat(4, p.getGiaP());
            return pps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean update(Phong p){
        String sql = "update DatPhong set soP = ?, loaiP = ?, giaP = ? where maP = ?";
        try {
            Connection con = DataProvider.dataConnection();
            PreparedStatement pps = con.prepareCall(sql);
            pps.setInt(1, p.getSoP());
            pps.setString(2, p.getLoaiP());
            pps.setFloat(3, p.getGiaP());
            pps.setString(4, p.getMaP());
            return pps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean delete(String maP){
        String sql = "delete from DatPhong where maP = ?";
        try {
            Connection con = DataProvider.dataConnection();
            PreparedStatement pps = con.prepareCall(sql);
            pps.setString(1, maP);
            return pps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
