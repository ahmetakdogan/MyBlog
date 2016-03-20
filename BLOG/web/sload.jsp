<%-- 
    Document   : sload
    Created on : 07.Ara.2015, 14:14:42
    Author     : TuX
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <%
      String kullanici = session.getAttribute("username")+"";
      out.println("<h1>Merhaba "+kullanici+"</h1>");
    %>
</body>
</html>
