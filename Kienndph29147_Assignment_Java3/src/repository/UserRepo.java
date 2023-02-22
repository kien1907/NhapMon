/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import Model.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class UserRepo {

    public User geUser(String userName, String passWord) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "select * from USERS where Usernames = ? and PassWords = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, passWord);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            rs.next();
            String userName1 = rs.getString("Usernames");
            String passWord1 = rs.getString("PassWords");
            String role = rs.getString("roles");
            User us = new User(userName1, passWord1, role);
            return us;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
