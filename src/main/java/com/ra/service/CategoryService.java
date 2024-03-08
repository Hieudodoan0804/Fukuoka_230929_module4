package com.ra.service;

import com.ra.entity.Category;
import com.ra.until.MySqlConnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    public  List<Category> findAll() {
        Connection conn = null;
        PreparedStatement pst;
        ResultSet rs;
        List<Category> categories = new ArrayList<>();
        try {
            conn = MySqlConnect.open();
            String sql = "SELECT * FROM Categories ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
               Category category = new Category();
               category.setCategoryId(rs.getInt("CategoryID"));
               category.setCategoryName(rs.getString("CategoryName"));
               category.setDescription(rs.getString("Description"));
               category.setParentCategoryId(rs.getInt("ParentCategoryID"));
               categories.add(category);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            MySqlConnect.close(conn);
        }
        return categories;
    }


    public Category insert(Category category) {
        Connection conn = null;
        try {
            conn = MySqlConnect.open();
            String query = "INSERT INTO Categories(CategoryID,CategoryName,Description,ParentCategoryID) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,category.getCategoryId());
            ps.setString(2,category.getCategoryName());
            ps.setString(3,category.getDescription());
            ps.setInt(4,category.getParentCategoryId());
            int result = ps.executeUpdate();
            if (result > 0) {
                try (ResultSet generateKeys = ps.getGeneratedKeys()){
                    while (generateKeys.next()){
                        category.setCategoryId(generateKeys.getInt(1));
                    }
                }
            }
            return category;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            MySqlConnect.close(conn);
        }
        return null;
    }
}
