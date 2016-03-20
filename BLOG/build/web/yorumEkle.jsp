<%@page import="blog.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
  String id = request.getParameter("y_id");
  String ad = request.getParameter("ad");
  String em = request.getParameter("em");
  String yorum = request.getParameter("yorum");
  String ip = request.getRemoteHost();
  
  DB db = new DB();
  String q = "call sp_yorum_ekle ($yid, '$ip', '$ad', '$em', '$yorum')";
  q = q.replace("$yid", id)
          .replace("$ip", ip)
          .replace("$ad", ad)
          .replace("$em", em)
          .replace("$yorum", yorum);
  
  db.qNR(q);
  
    
%>
