<%--
  Created by IntelliJ IDEA.
  User: huuhi
  Date: 09/02/2020
  Time: 10:24 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
  .login {
    height:230px; width:330px;
    margin:0px;
    padding:10px;
    border:2px #cc3031 solid;
  }
  .login input {
    padding:1px; margin:1px
  }
</style>
  <body>
  <form method="post" action="/discount_calculator">
    <div class="login">
      <h3>Product Discount Calculator</h3>
      <label>Product Description:</label>
      <input type="text" name="description">
      <br>
      <label>List Price:</label>
      <input type="text" name="price">
      <br>
      <label>Discount Percent:</label>
      "(%)"
      <input type="text" name="discount">
      <br>
      <input type="submit" name="submit">
    </div>



  </form>

  </body>
</html>
