<%@page import="blog.DB"%>
<%
    String ne = request.getParameter("ne");
    DB db = new DB();
    if (ne.equals("yorum"))
    {
        String id = request.getParameter("id");
        db.qNR("delete from yorum where id = "+id);
    }
    
    if (ne.equals("kategori"))
    {
        String id = request.getParameter("id");
        db.qNR("delete from yorum where id = "+id);
    }
    
    if (ne.equals("yazi"))
    {
        String id = request.getParameter("id");
        db.qNR("delete from yazi where id = "+id);
    }
%>