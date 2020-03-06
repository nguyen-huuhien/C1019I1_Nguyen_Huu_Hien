<%--
  Created by IntelliJ IDEA.
  User: huuhi
  Date: 12/02/2020
  Time: 2:25 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product</h1>
<p><a href="/products?action=create">Create new product</a></p>
<form action="/products?action=search" method="post">
    <input type="text" name="search"/>
    <input type="submit" value="ABC"/>
</form>


<table border="1">
    <tr>
        <td>Name</td>
        <td>Year</td>
        <td>Origin</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getYear()}</td>
            <td>${product.getOrigin()}</td>
            <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
