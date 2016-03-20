<%-- 
    Document   : yorumSil
    Created on : 08.Ara.2015, 12:58:55
    Author     : TuX
--%>

<%@page import="blog.DB"%>
<%
    String id = request.getParameter("id");
    DB db = new DB();
    db.qNR("delete from kategoriler where id = "+id);
    response.sendRedirect("kategoriEkle.jsp");
%>
