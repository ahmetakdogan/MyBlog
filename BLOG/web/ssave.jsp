
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
  String un = request.getParameter("un");
  
  // SESSION AÇMA
  session.putValue("username", un);
  out.println("<h1>SESSION CREATED</h1>");
%>