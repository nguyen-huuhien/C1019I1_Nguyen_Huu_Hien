<%--
  Created by IntelliJ IDEA.
  User: huuhi
  Date: 13/02/2020
  Time: 9:37 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Chuyen Doi Tien Te</title>
  </head>
  <body>
  <h1>Chuyển Đổi Tiền Tệ</h1>
  <form action="/1" method="get">
    <table >
      <tr>
        <td>RATE: </td>
        <td><input type="text" name="rate" value="22000"></td>
      </tr>
      <tr>
        <td>USD: </td>
        <td><input type="text" name="usd" ></td>
      </tr>
      <tr>
        <td> <input type="submit" name="submit" value="Converter"></td>
            </tr>
    </table>
    <h1>${usd1}</h1>
  </form>
  </body>
</html>
