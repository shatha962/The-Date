<%--
  Created by IntelliJ IDEA.
  User: SYSCOM
  Date: 1/6/2021
  Time: 6:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Time</title>
    <style>
        h1{
            text-align: center;
            color: green;
        }
    </style>
</head>
<body>
<h1><c:out value="${time}"/></h1>
</body>
</html>
