<%--
  Created by IntelliJ IDEA.
  User: huuhi
  Date: 12/02/2020
  Time: 4:08 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to Product list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Year: </td>
        <td>${requestScope["product"].getYear()}</td>
    </tr>
    <tr>
        <td>Origin: </td>
        <td>${requestScope["product"].getorigin()}</td>
    </tr>
</table>
</body>
</html>