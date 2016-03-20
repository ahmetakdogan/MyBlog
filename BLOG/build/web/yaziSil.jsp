<%@page import="blog.DB"%>
<%
    DB db = new DB();
    String id = request.getParameter("yaziId");
    
    db.qNR("delete from yazilar where id = "+id);
    out.println("OK");
%>