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
    <c:forEach items="${employeeList}" var="employee">
        ${employee}
        <hr>
    </c:forEach>
</p>


</body>
</html>