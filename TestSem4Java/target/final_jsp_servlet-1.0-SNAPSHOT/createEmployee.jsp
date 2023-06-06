<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Employee</title>
</head>
<body>
<form id="resetForm" action="employeeServlet" method="post">
    Full Name:  <input required type="text" name="fullName">
    Birth Day:  <input required type="text" name="birthDay">
    Address:  <input required type="text" name="address">
    Position:  <input required type="text" name="position">
    Department:  <input required type="text" name="department">
    <input type="submit" value="submit">
    <input onclick="resetForm()" type="submit" value="reset">
</form>

<a style="margin-top: 10px" href="employeeServlet">view all employee</a>

<script>
    function resetForm() {
        document.getElementById("resetForm").reset();
    }
</script>
</body>
</html>
