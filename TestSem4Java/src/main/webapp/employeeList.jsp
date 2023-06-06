<%@ page import="java.util.List" %>
<%@ page import="com.example.final_jsp_servlet.entity.Employee" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list Admin</title>
</head>
<body>
<table border="1" style="width: 100%;">
    <tr>
        <th>ID</th>
        <th>Full Name</th>
        <th>Birth Day</th>
        <th>Address</th>
        <th>Position</th>
        <th>Department</th>
    </tr>
    <%
        List<Employee> employeeList = (List<Employee>) request.getAttribute("employeeList");
        for (Employee employee : employeeList) {
    %>
    <tr>
        <td><%= employee.getId() %></td>
        <td><%= employee.getFullName() %></td>
        <td><%= employee.getBirthDay() %></td>
        <td><%= employee.getAddress() %></td>
        <td><%= employee.getPosition() %></td>
        <td><%= employee.getDepartment() %></td>
    </tr>
    <%
        }
    %>
</table>

<a style="margin-top: 10px" href="./">create employee</a>

</body>
</html>
