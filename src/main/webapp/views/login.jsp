<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024/03/07
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng nhập</title>
</head>
<body>
    <h1>Đăng nhập</h1>
    <form action="/Login" method="post">
        <p>Tài khoản: <input type="text" name="username"></p>
        <p>Mật khẩu: <input type="password" name="password"></p>
        <button>Đăng nhập</button>
    </form>
</body>
</html>
