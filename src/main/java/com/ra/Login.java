package com.ra;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Login",value = "/Login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String username = request.getParameter("username");
        String  password = request.getParameter("password");
        if (username.equals("admin") && password.equals("12345")){
            request.getSession().setAttribute("user",username);
            response.sendRedirect("trang chu-servlet");
        }else {
            request.getRequestDispatcher("views/login.jsp").forward(request,response);
        }
    }
}
