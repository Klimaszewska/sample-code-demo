<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Employee Base</title>
</head>
<body>

<p>
    <b>Employee Base Dynamic Content</b>
</p>
<p>
    <c:set var="counter" scope="page" value="1"/>
    <c:forEach items="${employeeList}" var="employee">
        ${counter}. ${employee}
        <c:set var="counter" value="${counter + 1}" scope="page"/>
        <hr>
    </c:forEach>
</p>


</body>
</html>