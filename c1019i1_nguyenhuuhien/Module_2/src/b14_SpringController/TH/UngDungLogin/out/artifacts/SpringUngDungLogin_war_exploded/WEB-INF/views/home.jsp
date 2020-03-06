<%--
  Created by IntelliJ IDEA.
  User: huuhi
  Date: 14/02/2020
  Time: 8:51 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>
<form:form action="login" method="post" modelAttribute="login">
    <fieldset>
        <legend>Login</legend>
        <table>
            <tr>
                <td>
                    <form:label path="taiKhoan">Account</form:label></td>
                <td>
                    <form:input path="taiKhoan"/></td>
            </tr>
            <tr>
                <td><form:label path="matKhau">Password:</form:label></td>
                <td><form:input path="matKhau"/></td>
            </tr>
            <tr>
                <td></td>
                <td><form:button>Login</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
