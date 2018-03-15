<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Employee Base</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        body {
            padding: 20px;
        }
    </style>
</head>
<body>

<p align="center">
    <b>Employee Base</b>
    <br>
    as of: <%= new java.util.Date() %>
    <br>
</p>
<ul class="nav nav-tabs">
    <li class="nav-item">
        <a class="nav-link active" href="/">Home</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/addEmployee">Add Employees</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/displayEmployee">View Employees</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/searchEmployee">Search</a>
    </li>
</ul>

</body>
</html>