package repository;

import Model.StudentFpoly;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentFpolyRepo {

    public boolean them(StudentFpoly sf) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "insert into STUDENTS (masv,HoTen,Email,SoDT,GioiTinh,DiaChi,HinhAnh)\n"
                    + "values (?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sf.getMaSV());
            ps.setString(2, sf.getTen());
            ps.setString(3, sf.geteMail());
            ps.setString(4, sf.getsDT());
            ps.setInt(5, sf.getGioiTinh());
            ps.setString(6, sf.getDiaChi());
            ps.setString(7, sf.getTenAnh());
            ps.execute();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean sua(StudentFpoly sf) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "update STUDENTS\n"
                    + "set HoTen = ?,Email = ?,SoDT = ?,GioiTinh= ?,DiaChi = ?,HinhAnh = ?\n"
                    + "where masv = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sf.getTen());
            ps.setString(2, sf.geteMail());
            ps.setString(3, sf.getsDT());
            ps.setInt(4, sf.getGioiTinh());
            ps.setString(5, sf.getDiaChi());
            ps.setString(6, sf.getTenAnh());
            ps.setString(7, sf.getMaSV());
            ps.execute();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean xoa(StudentFpoly sf) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "delete from STUDENTS where masv = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sf.getMaSV());
            ps.execute();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public ArrayList<StudentFpoly> getAllStudents() {
        ArrayList<StudentFpoly> list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "select * from STUDENTS";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String masv = rs.getString("masv");
                String hoTen = rs.getString("HoTen");
                String email = rs.getString("Email");
                String soDT = rs.getString("SoDT");
                int gioiTinh = rs.getInt("GioiTinh");
                String diaChi = rs.getString("DiaChi");
                String hinhAnh = rs.getString("HinhAnh");
                StudentFpoly sf = new StudentFpoly(masv, hoTen, email, soDT, gioiTinh, diaChi, hinhAnh);
                list.add(sf);
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            return list;
        }
    }
}
