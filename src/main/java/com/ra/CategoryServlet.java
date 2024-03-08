package com.ra;

import com.ra.entity.Category;
import com.ra.service.CategoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CategoryServlet", value = "/CategoryServlet")

public class CategoryServlet extends HttpServlet {
    /**
     * Viết ứng dụng web cho phép thêm và hiển thị danh sách category. Sử dụng lại CSDL trong module 3 hoặc tạo mới.
     * Sử dụng hệ quản trị CSDL MySQL
     */

    CategoryService categoryService = new CategoryService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Category> categories = categoryService.findAll();
        request.setAttribute("categories",categories);
        request.getRequestDispatcher("views/category.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Category category = new Category();
        category.setCategoryName(request.getParameter("categoryName"));
        category.setDescription(request.getParameter("description"));
        category.setParentCategoryId(Integer.parseInt(request.getParameter("parentCategoryId")));
        categoryService.insert(category);

        List<Category> categories = categoryService.findAll();
        request.setAttribute("categories",categories);
        request.getRequestDispatcher("views/category.jsp").forward(request,response);
    }
}
