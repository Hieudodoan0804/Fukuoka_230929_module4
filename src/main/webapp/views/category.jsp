<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024/03/08
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Category</title>
</head>
<body>
    <table>
        <thead>
        <tr>
            <th>CategoryId</th>
            <th>CategoryName</th>
            <th>Description</th>
            <th>ParentCategoryId</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${categories}" var="stg">
                <tr>
                    <td>${stg.categoryId}</td>
                    <td>${stg.categoryName}</td>
                    <td>${stg.description}</td>
                    <td>${stg.parentCategoryId}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="views/home.jsp">Create New Category</a>
</body>
</html>
