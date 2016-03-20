<%@page import="java.sql.ResultSet"%>
<%@page import="blog.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
  String un = request.getParameter("un");
  String pw = request.getParameter("pw");
  
  DB db =new DB();
  
  String q = "call sp_admin_login('"+un+"','"+pw+"')";
  ResultSet rs = db.qWR(q);
  rs.next();
  int res = rs.getInt("Result");
  if (res != 0)
  {
      int id = rs.getInt("id");
      session.putValue("user_id", id);
      session.putValue("un", rs.getString("un"));
      out.println("OK");
  }
  else
  out.println("ERROR");
    
%>