<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Employee Base</title>
</head>
<body>

<p align="center">
    <b>Employee Base</b>
    <br>
    as of: <%= new java.util.Date() %>
    <br>
</p>

<p>
    <br><br>
    In some time, you will be able to add employees to this list.
    <br>
    <c:out value="${'There is no need to use any <html> tags.'}" escapeXml="true"/>
    You will just fill in a form.
    <br><br>
</p>

<div>
<form action="/post" method="post">
    <p><b>Add employee details</b></p>
    <p>
    Employee ID:<br>
    <input type="number" name="employeeId"><br>
    First name:<br>
    <input type="text" name="firstName"><br>
    Last name:<br>
    <input type="text" name="lastName"><br>
    <br>
    Sex:<br>
    <input type="radio" name="gender" value="male" checked> Male<br>
    <input type="radio" name="gender" value="female"> Female<br>
    <input type="radio" name="gender" value="other"> Not disclosed<br>
    <br>
    Hire date:<br>
    <input type="date" name="hireDate"><br>
    <br>
    <input type="submit">
    <br><br>
    </p>
</form>
</div>


<p>
    <jsp:include page="employeeListSearch.jsp"/>
</p>

</body>
</html>