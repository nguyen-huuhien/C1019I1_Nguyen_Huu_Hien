<%--
  Created by IntelliJ IDEA.
  User: huuhi
  Date: 10/02/2020
  Time: 4:16 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form method="post" action="/calculator">
    <fieldset>
      <legend>Calculator</legend>
      <table>
        <tr>
          <td>Fist operand: </td>
          <td><input name="fist-operand" type="text"></td>
        </tr>
        <tr>
          <td>Operator: </td>
          <td>
            <select name="operator">
            <option value="+">Addition</option>
            <option value="-">Subtraction</option>
            <option value="*">Multiplication</option>
            <option value="/">Division</option>
          </select>
          </td>
        </tr>
        <tr>
          <td>Second operand: </td>
          <td><input type="text" name="second-operand"></td>
        </tr>
        <tr>
          <td></td>
          <td><input type="submit" value="Calculator"></td>
        </tr>
      </table>
    </fieldset>
  </form>
  </body>
</html>
