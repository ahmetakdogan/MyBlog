<%@page import="java.sql.ResultSet"%>
<%@page import="blog.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  DB db = new DB();
  Object o = session.getAttribute("user_id");
  if (o == null)
  {
      response.sendRedirect("index.jsp");
      return;
  }
    
%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Yönetim</title>
        <meta charset=UTF-8">
        <!-- JQUERY'I EKLE -->
        <script src="jq.js"></script>
        <!-- BOOTSTRAP'I EKLE -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <style>
            
        </style>
        </head>
<body>
<div id="container">
    <!-- NAVBAR -->
    <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">MY BLOG</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        
        
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Yazılar <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="yaziEkle.jsp">Yeni Yazı Ekle</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Yazıları Listele</a></li>
          </ul>
        </li>
		
		<li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Kategoriler <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Yeni Kategori Ekle</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Kategorileri Listele</a></li>
          </ul>
        </li>
          
          <li><a href="#">Yorumlar</a></li>
      </ul>
      
      <ul class="nav navbar-nav navbar-right">
       
        <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><%=session.getAttribute("un")+""%> <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#" id="linkSifreDegistir">Şifre Değiştir</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="exit.jsp">Çıkış Yap</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
          <script>
              $("#linkSifreDegistir").click(function()
              {
                  $("#pwModal").modal('show');
              });
              </script>
    <!-- NAVBAR -->
    
    <div id="content" style="margin-left:20px;margin-right: 20px">
    <!-- CONTENT -->

    <div class="panel panel-warning">
        <div class="panel-heading">
            <b>Yazılara Yapılan Yorumlar</b>

        </div>
        <div class="panel-content">
            <table width="100%" class="table table-striped table-bordered table-hovered">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Yorum Tarihi</th>
                        <th>Yorum Yapan</th>
                        <th>IP Adresi</th>
                        <th>Yazı Başlığı</th>
                        <th>Yorum</th>
                        <th>Sil</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                      ResultSet yorumRS = db.qWR("call sp_get_tum_yorumlar()");
                      while (yorumRS.next())
                      {
                          String id = yorumRS.getString("ID");
                          out.println("<tr>");
                          out.println("<td>"+yorumRS.getString("ID")+"</td>");
                          out.println("<td>"+yorumRS.getString("YorumTarihi")+"</td>");
                          out.println("<td>"+yorumRS.getString("YorumYapan")+"</td>");
                          out.println("<td>"+yorumRS.getString("IPAdresi")+"</td>");
                          out.println("<td>"+yorumRS.getString("YaziBasligi")+"</td>");
                          out.println("<td>"+yorumRS.getString("Icerik")+"</td>");
                          out.println("<td><a href='yorumSil.jsp?id="+id+"'><i class='fa fa-trash-o fa-2x'></i></a>");
                          out.println("</tr>");
                      }
                    %>
                </tbody>
            </table>
        </div>
    </div>
    <!-- CONTENT -->
    </div>
    </div>
          
          
          <!-- Modal -->
<div style="margin-top:10%" id="pwModal" class="modal fade " role="dialog">
  <div class="modal-dialog modal-sm">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Şifrenizi Değiştirin</h4>
      </div>
      <div class="modal-body">
        
        
        <div class="form-group">
            <label>Yeni Şifreniz : </label>
            <input type="text" id="pw" name="pw" class="form-control" />
        </div>
          
          
      </div>
      <div class="modal-footer">
        <button type="button" id="btnSifreDegistir" class="btn btn-default" data-dismiss="modal">TAMAM</button>
      </div>
          
          <script>
              $("#btnSifreDegistir").click(function()
              {
                  var pw = $("#pw").val();
                  $.post("changePw.jsp", {"pw":pw}, function(data,success)
                  {
                     var ne = $.trim(data);
                     alert(ne);
                     if (ne == "OK")
                     {
                        alert("Şifreniz Değiştirildi"); 
                     }
                  });
              })
          </script>
    </div>
  </div>
</div>  
</body>
</html>
