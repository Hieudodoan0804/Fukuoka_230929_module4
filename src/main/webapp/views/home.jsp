<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024/03/06
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- Thêm thư viện thẻ trong JSP--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Trang chu</title>
</head>
<body>
<%--    <h1>Email:${txtEmail}</h1>--%>
<%--    <h1>Name:${txtName}</h1>--%>
<%--    <h1>Giới tính:--%>
<%--        <c:if test="${txtGender == true}"><span>Nam</span> </c:if>--%>
<%--        <c:if test="${txtGender == false}"><span>Nữ</span> </c:if>--%>
<%--    </h1>--%>
<%--    <h1>Ngày sinh: <fmt:formatDate value="${txtBirthDay}" pattern="dd-mm-yyyy"/> </h1>--%>
<%--    <h1>Cost:<fmt:formatNumber value="${cost}" type="number"/></h1>--%>
<%--    <h1>Sở thích</h1>--%>
<%--    <ul>--%>
<%--        <c:forEach var="str" items="${listFav}">--%>
<%--            <li>${str}</li>--%>
<%--        </c:forEach>--%>
<%--    </ul>--%>


<%--    <h1>Category:</h1>--%>
<%--    <ul>--%>
<%--      <li>${categoryId}</li>--%>
<%--      <li>${categoryName}</li>--%>
<%--      <li>${description}</li>--%>
<%--      <li>${parentCategoryId}</li>--%>
<%--    </ul>--%>
    <form action="<%=request.getContextPath()%>/CategoryServlet" method="post">
        <table>
            <tr>
                <td>CategoryName</td>
                <td><input type="text" name="categoryName"/></td>
            </tr>
            <tr>
                <td>Description</td>
                <td><input type="text" name="description"/></td>
            </tr>
            <tr>
                <td>ParentCategoryId</td>
                <td><input type="number" name="parentCategoryId"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
