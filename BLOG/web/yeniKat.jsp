<%@page import="blog.DB"%>
<%
    
    String ad = request.getParameter("kAd");
    DB db = new DB();
    
    String q = "insert into kategoriler values (0,'"+ad+"')";
    db.qNR(q);
    
    response.sendRedirect("kategoriEkle.jsp");
    
    
%>