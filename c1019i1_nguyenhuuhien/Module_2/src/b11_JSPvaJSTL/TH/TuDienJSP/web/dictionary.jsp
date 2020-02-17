<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: huuhi
  Date: 10/02/2020
  Time: 2:27 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%
    Map<String, String> dic = new HashMap<>();
%>

<%
    dic.put("hello", "xin chao");
    dic.put("that","do");
    dic.put("me","toi");
    dic.put("computer","may tinh");

    String sreach = request.getParameter("textInput");

    String result = dic.get(sreach);
    if (result != null){
        out.print("Word: " + sreach+"<br>");
        out.print("Resuilt: "+ result);
    }else {
        out.print("Not found");
    }
%>
</body>
</html>
