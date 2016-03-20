<%@page import="blog.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  String baslik = request.getParameter("baslik");
  String kat    = request.getParameter("kategori");
  String icerik = request.getParameter("icerik");
  String yorumaAcik = request.getParameter("yorumaAcik");
  String uid = session.getAttribute("user_id")+"";
    
  String q = "insert into yazilar values (0,"+uid+", "+kat+", now(), '"+baslik+"', '"+icerik+"', "+yorumaAcik+")";
  //out.println(q);
  DB db = new DB();
  db.qNR(q);
  response.sendRedirect("yonetim.jsp");
%>