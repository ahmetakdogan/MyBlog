<%@page import="blog.DB"%>
<%
  
    String id = session.getAttribute("user_id")+"";
    String pw = request.getParameter("pw");
    
    DB db = new DB();
    String q = "update accounts set pw = '"+pw+"' where id = "+id;
    db.qNR(q);
    out.println(q);

    
    
%>