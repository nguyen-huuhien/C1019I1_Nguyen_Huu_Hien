<%--
  Created by IntelliJ IDEA.
  User: huuhi
  Date: 17/02/2020
  Time: 9:49 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form action="giavi" method="post">
    <tr>
        <td><input type="checkbox"name = "condiment" value="mam">Mắm</td>
        <td><input type="checkbox"name = "condiment" value="muoi">Muối</td>
        <td><input type="checkbox" name = "condiment"value="xidau">Xì Dầu</td>
        <td><input type="checkbox" name = "condiment"value="vitinh">Vị Tinh</td>
        <td><input type="checkbox" name = "condiment"value="thit">Thịt</td>
        <td><input type="checkbox" name = "condiment"value="cachua">Cà chua</td>
        <td><input type="submit" value="save"></td>
    </tr>
    <c:forEach items="${mess}" var="eat">
    <h3>${eat}</h3>
    </c:forEach>
</form>

</body>
</html>
