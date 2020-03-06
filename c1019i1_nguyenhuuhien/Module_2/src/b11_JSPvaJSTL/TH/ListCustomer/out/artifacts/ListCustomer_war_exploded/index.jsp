<%@ page import="java.util.List" %>
<%@ page import="Customer.Customer" %><%--
  Created by IntelliJ IDEA.
  User: huuhi
  Date: 11/02/2020
  Time: 8:21 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>List Customer</title>
  </head>
  <body>
  <%
  List<Customer> customerList = Customer.getListCustomer();
  request.setAttribute("listCus",customerList);
  %>
  <div class="container">
    <h2 id="h2">Danh Sách Khách hàng</h2>
    <br/>
    <table border="1px" class="table">
      <thread>
        <tr>
          <th class="th">Họ tên</th>
          <th class="th">Ngày Sinh</th>
          <th class="th">Địa Chỉ</th>
          <th class="th">Ảnh</th>
        </tr>
      </thread>
      <tbody class="body">
      <c:forEach var="Cus" items="${listCus}">
        <tr>
          <td><c:out value="${Cus.name}"/></td>
          <td><c:out value="${Cus.bithday}"/></td>
          <td><c:out value="${Cus.address}"/></td>
          <td class="td">
            <img src="<c:out value="${Cus.picture}"/>">
          </td>
        </tr>
      </c:forEach>
      </tbody>
    </table>


  </div>

  </body>
</html>
