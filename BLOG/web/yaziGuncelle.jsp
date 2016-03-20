<%@page import="blog.DB"%>
<%
    DB db = new DB();
    String id = request.getParameter("yaziId");
    String baslik = request.getParameter("baslik");
    String yorumaAcik = request.getParameter("yorumaAcik");
    String kategori = request.getParameter("kategori");
    String icerik = request.getParameter("icerik");
    
            
    String q = "update yazilar set baslik = '$baslik', kategori_id = $kat, "+
               "icerik = '$icerik', yorum_acik = '$yorumaAcik' where id ="+id;
    
    q = q.replace("$baslik",baslik).replace("$kat", kategori)
            .replace("$yorumaAcik", yorumaAcik)
            .replace("$icerik", icerik);
    
    db.qNR(q);
    out.println("OK");
%>