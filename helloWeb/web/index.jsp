<%--
  Created by IntelliJ IDEA.
  User: lanouhn
  Date: 17/7/20
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    String name = new String();
    name  = "皇甫奇";
  %>

  <%=name%>



  <form action="/cs" method="post">
      <input type="submit" value="visit by POST">
  </form>


  </body>
</html>
