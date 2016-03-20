<%@page import="java.sql.ResultSet"%>
<%@page import="blog.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  String kid = request.getParameter("id")+"";
  DB db = new DB();  
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MY BLOG</title>
        <meta charset=UTF-8">
        <!-- JQUERY'I EKLE -->
        <script src="jq.js"></script>
        <!-- BOOTSTRAP'I EKLE -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
    
        <style>
            
        </style>
        </head>
<body>
<div id="container" style="margin:30px;">
    <div class="row" >
        <div id="icerik_bolumu" class="col-md-9" >
            <%
                ResultSet rs = db.qWR("call sp_get_kategori_yazilari("+kid+")");
                
                while (rs.next())
                {
                    /*
                      YazarAdi  | YaziId | Baslik  | Tarih | 
                     Icerik        | YorumSayisi |
                             */
                    String baslik = rs.getString("Baslik");
                    
                    String yazar = rs.getString("YazarAdi");
                    String yaziId = rs.getString("YaziId");
                    String tarih = rs.getString("Tarih");
                    String icerik = rs.getString("Icerik");
                    
                    int l = icerik.length();
                    String tmp = (l > 500) ? icerik.substring(0, 500)+" ..." : icerik;
                    
                    String yorumSayisi = rs.getString("YorumSayisi");
                    String kategori = rs.getString("Kategori");
                %>
                    
                    <div class="panel panel-success">
                        <div class="panel-heading">
                            <b><a href="yazi.jsp?id=<%=yaziId%>" target="_blank"><%=baslik%></a></b>
                        </div>
                        <div class="panel-content" style="padding:12px; text-align:justify">
                        <%=tmp%>
                        <a href="yazi.jsp?id=<%=yaziId%>" target="_blank" ><b><u>Devamını Oku</u></b></a>
                                
                        </div>
                        
                        <div class="panel-footer">
                        <table width="100%">
                                <tr>
                                    <td align="left" width="25%">
                                    <span class="glyphicon glyphicon-user" aria-hidden="true"></span>    
                                    <b><%=yazar%></b></td>
                                    
                                    <td align="center"  width="25%">
                                    <span class="glyphicon glyphicon-th" aria-hidden="true"></span>    
                                    <b><%=kategori%></b></td>
                                    
                                    <td align="center"  width="25%">
                                    <span class="glyphicon glyphicon-comment" aria-hidden="true"></span>    
                                    <b><%=yorumSayisi%></b></td>
                                    
                                    <td align="right"  width="25%">
                                    <span class="glyphicon glyphicon-time" aria-hidden="true"></span>    
                                    <b><%=tarih%></b></td>
                                </tr>
                            </table>
                        </div>
                        
                    </div>
                    
                    <%
                }
                
                
                %>
        </div>
        <div id="sag_menu" class="col-md-3">
            
            <div class="panel panel-warning">
                <div class="panel-heading">
                    <b>YÖNETİM</b>
                </div>
                
                <div class="panel-content" style="padding:12px;">
                    <b><a href="#" id="glp">Giriş Yap</a></b>
                </div>
            </div>
            
            <div class="panel panel-warning">
                <div class="panel-heading">
                    <b>KATEGORILER</b>
                </div>
                
                <div class="panel-content" style="padding:12px;">
                    <%
                        rs = db.qWR("select * from kategoriler");
                        while (rs.next())
                        {
                            String id = rs.getString("id");
                            String ad = rs.getString("ad");
                            String link = "kategoriYazilari.jsp?id="+id;
                            out.println("<b><a href=\""+link+"\" target=\"_blank\">"+ad+"</a><br>");
                        }
                    
                    %>
                </div>
            </div>
                
                <div class="panel panel-warning">
                <div class="panel-heading">
                    <b>ARŞİVLER</b>
                </div>
                
                <div class="panel-content" style="padding:12px;">
                    <%
                        rs = db.qWR("call sp_list_yazi_tarihleri()");
                        while (rs.next())
                        {
                            String ay = rs.getString("Ay");
                            String yil= rs.getString("Yil");
                            
                            String zaman = rs.getString("Liste");
                            
                            out.println("<b><a href=\"arsivYazilari.jsp?ay="+ay+"&yil="+yil+"\" target=\"_blank\">"+zaman+"</a><br>");
                        }
                    
                    %>
                </div>
            </div>
                
            
                
                <div class="panel panel-warning">
                <div class="panel-heading">
                    <b>EN SON YAZILANLAR</b>
                </div>
                
                <div class="panel-content" style="padding:12px;">
                    <%
                        rs = db.qWR("call sp_get_son_yazilar()");
                        while (rs.next())
                        {
                            String id = rs.getString("id");
                            String baslik = rs.getString("baslik");
                            String link = "yazi.jsp?id="+id;
                            out.println("<b><a href=\""+link+"\" target=\"_blank\">"+baslik+"</a><br>");
                        }
                    
                    %>
                </div>
            </div>
            
        </div>
    </div>
</div>
                
                
<!-- Modal -->
<div style="margin-top:10%" id="loginModal" class="modal fade " role="dialog">
  <div class="modal-dialog modal-sm">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Yönetici Girişi</h4>
      </div>
      <div class="modal-body">
        
          <div class="form-group">
            <label>Username:</label>
            <input type="text" id="un" name="un" class="form-control" />
        </div>

        <div class="form-group">
            <label>Password : </label>
            <input type="password" id="pw" name="pw" class="form-control" />
        </div>
          
          
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">TAMAM</button>
      </div>
    </div>

  </div>
</div>                
           
<script>
    $("#glp").click(function()
    {
        $("#loginModal").modal('show');
    });
    </script>
</body>
</html>
