/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBPOOL;

import java.util.ArrayList;
import java.util.List;
import model.NhanVien;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class QLNV {
    
    public List<NhanVien> getAll() throws SQLException, ClassNotFoundException{
        List<NhanVien> lstNV = new ArrayList<NhanVien>();
        String query = "SELECT * FROM NHANVIEN";
        Connection con = DBConnection.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()){
            NhanVien nv = new NhanVien();
            nv.setId(rs.getString(1));
            nv.setMa(rs.getString(2));
            nv.setTen(rs.getString(3));
            nv.setTenDem(rs.getString(4));
            nv.setHo(rs.getString(5));
            nv.setGioiTinh(rs.getString(6));
            nv.setNgaySinh(Date.valueOf(rs.getString(7)));
            nv.setDiaChi(rs.getString(8));
            nv.setSdt(rs.getString(9));
            nv.setMatKhau(rs.getString(10));
            nv.setIdCV(rs.getString(11));
            nv.setTrangThai(rs.getBoolean(12));
            lstNV.add(nv);
        }
        return lstNV;
    }
}
