<%@page import="java.sql.ResultSet"%>
<%@page import="blog.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    DB db = new DB();
    int id = 0;
    String tmp = request.getParameter("id");
    if (tmp == null)
    {
        response.sendRedirect("index.jsp");
        return;
    }
        id = new Integer(tmp);
     
    
    ResultSet rs = db.qWR("call sp_get_yazi("+id+")");
    rs.next();
    String baslik = rs.getString("Baslik");
                    
    String yazar = rs.getString("YazarAdi");
    String yaziId = rs.getString("YaziId");
    String tarih = rs.getString("Tarih");
    String icerik = rs.getString("Icerik");
    String yorumSayisi = rs.getString("YorumSayisi");
    String kategori = rs.getString("Kategori");
    String yorumaAcikMi = rs.getString("YorumaAcikMi");
    
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=baslik%></title>
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
           <div class="panel panel-success">
                        <div class="panel-heading">
                            <b><a href="yazi.jsp?id=<%=yaziId%>" target="_blank"><%=baslik%></a></b>
                        </div>
                        <div class="panel-content" style="padding:12px; text-align:justify">
                        <%=icerik%>
                        
                                
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
        <!-- YORUM BOLUMU -->
        <% if (yorumaAcikMi.equals("1")) { %>
        <div id="yorum_bolumu">
            <div class="panel panel-info">
                <div class="panel-heading">
                    <b>Yorum Yapın</b>
                </div>
                <div class="panel-content" style="padding:12px">
                    <form id="formYorumEkle">
                        <!-- GIZLI ELEMAN -->
                        <input type="hidden" name="y_id" value="<%=id%>" />
                    <div class="form-group">
                        <label><b>Adınız : </b></label>
                        <input type="text" class="form-control" required name="ad" />
                    </div>
                    
                    <div class="form-group">
                        <label><b>E-Posta : </b></label>
                        <input type="email" class="form-control" required name="em" />
                    </div>
                    
                    <div class="form-group" >
                        <label><b>Yorumunuz : </b></label>
                        <textarea name="yorum" required class="form-control" style="width:100%; height: 130px"></textarea>
                    </div>
                    
                    <div class="form-group text-right">
                        <button id="btnYorumGonder" class="btn btn-info" >YORUMU GÖNDER</button>
                    </div>
                    </form>
                    <script>
                      $("#btnYorumGonder").click(function()
                      {
                         var data = $("#formYorumEkle").serialize();
                         //alert(data);
                         
                         $.post("yorumEkle.jsp", data, function(data, success)
                         {
                             alert("Yorumunuz Kaydedildi Teşekkürler!");
                             location.reload();
                             
                         });
                         
                         return false;
                      });
                    </script>
                </div>
            </div>
            
            <div class="panel panel-warning">
                <div class="panel-heading">
                    <b>Kullanıcı Yorumları</b>
                </div>
                <div class="panel-content" style="padding:12px">
                    <%
                        ResultSet rsY = db.qWR("call sp_get_yorumlar("+id+")");
                        
                        while (rsY.next())
                        {
                            String yorumAdi = rsY.getString("ad");
                            String yorumEPosta = rsY.getString("eposta");
                            String yorumTarihi = rsY.getString("tarih");
                            String yorumIcerik = rsY.getString("icerik");
                            String bL = "<a href=\"mailto:"+yorumEPosta+"\">"+yorumAdi+"</a>";
                            %>
                            <table border="0" width="100%">
                                <tr>
                                    <td><b><%=bL%></b></td>
                                    <td align="right"><%=yorumTarihi%></td>
                                </tr>
                                <tr>
                                    <td colspan="2"><%=yorumIcerik%></td>
                            </table>
                            <br />
                            
                            <%
                                    
                        }
                    
                    %>
                </div>
            </div>
        </div>
               <% } %>     
        <!-- YORUM BOLUMU -->
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
                            String kid = rs.getString("id");
                            String ad = rs.getString("ad");
                            String link = "kategoriYazilari.jsp?id="+kid;
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
                            String zaman = rs.getString("Liste");
                            
                            out.println("<b><a href=\"#\" target=\"_blank\">"+zaman+"</a><br>");
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
                            String yid = rs.getString("id");
                            
                            String ybaslik = rs.getString("baslik");
                            String link = "yazi.jsp?id="+yid;
                            out.println("<b><a href=\""+link+"\" target=\"_blank\">"+ybaslik+"</a><br>");
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
