<%@ page import="java.util.List" %>
<%@ page import="com.example.final_jsp_servlet.entity.Admin" %><%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 6/1/2023
  Time: 7:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list Admin</title>
</head>
<body>

<table border="1" style="width: 100%;">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
    </tr>
    <%
        List<Admin> adminList = (List<Admin>) request.getAttribute("adminList");
        for (Admin admin : adminList) {
    %>
    <tr>
        <td><%= admin.getId() %></td>
        <td><%= admin.getName() %></td>
        <td><%= admin.getEmail() %></td>
    </tr>
    <%
        }
    %>
</table>

</body>
</html>
