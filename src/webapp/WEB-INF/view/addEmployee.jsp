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
        <a class="nav-link" href="/">Home</a>
    </li>
    <li class="nav-item">
        <a class="nav-link active" href="/addEmployee">Add Employees</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/displayEmployee">View Employees</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/searchEmployee">Search</a>
    </li>
</ul>


<div class="text-center">
    <br><br>
    Please fill in the form.
    <br><br>
</div>


<div class="form-group">
    <form method="post">
        <p><b>Add employee details</b></p>
        <p>
<%--        <div class="form-row">
            <div class="col-7">
            <input type="number" class="form-control" id="employeeId" name="employeeId" placeholder="Employee ID">
            </div>
        </div>--%>

        <div class="form-row">
            <div class="col-3">
                <input type="text" class="form-control" id="firstName" name="firstName" placeholder="First name">
            </div>
            <div class="col-4">
                <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Last name">
            </div>
        </div>
        <div>
            <br>
            Sex:<br>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="genderM" value="M">
                <label class="form-check-label" for="genderM">
                    Male
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="genderF" value="F">
                <label class="form-check-label" for="genderF">
                    Female
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="genderX" value="X">
                <label class="form-check-label" for="genderX">
                    Undisclosed
                </label>
            </div>
        </div>

        <br>
        <div class="form-row">
            <div class="col-7">
                <label for="hireDate">
                    Hire date:</label><br>
                <input type="date" class="form-control" id="hireDate" name="hireDate"><br>
                <br>
            </div>
        </div>

        <button class="btn btn-primary" type="submit">Submit</button>
        <br>
    </form>
</div>
</body>
</html>