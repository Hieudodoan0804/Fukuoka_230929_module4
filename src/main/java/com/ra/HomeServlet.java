package com.ra;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@WebServlet(name = "HomeServlet", value = "/trang chu-servlet")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            // chuyển tiếp request , response đến JSP để xử lý giao diện
            request.getRequestDispatcher("views/login.jsp").forward(request, response);
        }
        // lấy giá trị từ request
        String name = request.getParameter("name");
        String email = "hieu@gmail.com";
        boolean gender = true;
        List<String> fav = Arrays.asList("Game", "Bóng đá", "Chạy bộ");
        Date birthday = new Date();
        double cost = 123456789L;
        // truyền giá trị ra đến nơi sử lý view(JSP)
        request.setAttribute("txtEmail", email);
        request.setAttribute("txtName", name);
        request.setAttribute("txtGender", gender);
        request.setAttribute("listFav", fav);
        request.setAttribute("txtBirthDay", birthday);
        request.setAttribute("cost", cost);

// chuyển tiếp request , response đến JSP để xử lý giao diện
        request.getRequestDispatcher("views/home.jsp").forward(request, response);

    }
}
