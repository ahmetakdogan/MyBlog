
package blog;

public class Template 
{
    public static String getPageBegin()
    {
        return "<!DOCTYPE html>\n" +
"<html>\n" +
"   <head>\n" +
"        <meta http-equiv=\\\"Content-Type\\\" content=\\\"text/html; charset=UTF-8\\\">\n" +
"        <title>Yönetim</title>\n" +
"        <meta charset=UTF-8\\\">\n" +
"        <!-- JQUERY'I EKLE -->\n" +
"        <script src=\\\"jq.js\\\"></script>\n" +
"        <!-- BOOTSTRAP'I EKLE -->\n" +
"        <link rel=\\\"stylesheet\\\" href=\\\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\\\" integrity=\\\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\\\" crossorigin=\\\"anonymous\\\">\n" +
"        <link rel=\\\"stylesheet\\\" href=\\\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\\\" integrity=\\\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\\\" crossorigin=\\\"anonymous\\\">\n" +
"        <script src=\\\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\\\" integrity=\\\"sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS\\\" crossorigin=\\\"anonymous\\\"></script>\n" +
"        <link rel=\\\"stylesheet\\\" href=\\\"https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css\\\">\n" +
"        <style>\n" +
"            \n" +
"        </style>\n" +
"        </head>\n" +
"<body>\n" +
"<div id=\\\"container\\\">\n" +
"    <!-- NAVBAR -->\n" +
"    <nav class=\\\"navbar navbar-default\\\">\n" +
"  <div class=\\\"container-fluid\\\">\n" +
"    <!-- Brand and toggle get grouped for better mobile display -->\n" +
"    <div class=\\\"navbar-header\\\">\n" +
"      <button type=\\\"button\\\" class=\\\"navbar-toggle collapsed\\\" data-toggle=\\\"collapse\\\" data-target=\\\"#bs-example-navbar-collapse-1\\\" aria-expanded=\\\"false\\\">\n" +
"        <span class=\\\"sr-only\\\">Toggle navigation</span>\n" +
"        <span class=\\\"icon-bar\\\"></span>\n" +
"        <span class=\\\"icon-bar\\\"></span>\n" +
"        <span class=\\\"icon-bar\\\"></span>\n" +
"      </button>\n" +
"      <a class=\\\"navbar-brand\\\" href=\\\"#\\\">MY BLOG</a>\n" +
"    </div>\n" +
"\n" +
"    <!-- Collect the nav links, forms, and other content for toggling -->\n" +
"    <div class=\\\"collapse navbar-collapse\\\" id=\\\"bs-example-navbar-collapse-1\\\">\n" +
"      <ul class=\\\"nav navbar-nav\\\">\n" +
"        \n" +
"        \n" +
"        <li class=\\\"dropdown\\\">\n" +
"          <a href=\\\"#\\\" class=\\\"dropdown-toggle\\\" data-toggle=\\\"dropdown\\\" role=\\\"button\\\" aria-haspopup=\\\"true\\\" aria-expanded=\\\"false\\\">Yazılar <span class=\\\"caret\\\"></span></a>\n" +
"          <ul class=\\\"dropdown-menu\\\">\n" +
"            <li><a href=\\\"yaziEkle.jsp\\\">Yeni Yazı Ekle</a></li>\n" +
"            <li role=\\\"separator\\\" class=\\\"divider\\\"></li>\n" +
"            <li><a href=\\\"#\\\">Yazıları Listele</a></li>\n" +
"          </ul>\n" +
"        </li>\n" +
"		\n" +
"		<li class=\\\"dropdown\\\">\n" +
"          <a href=\\\"#\\\" class=\\\"dropdown-toggle\\\" data-toggle=\\\"dropdown\\\" role=\\\"button\\\" aria-haspopup=\\\"true\\\" aria-expanded=\\\"false\\\">Kategoriler <span class=\\\"caret\\\"></span></a>\n" +
"          <ul class=\\\"dropdown-menu\\\">\n" +
"            <li><a href=\\\"#\\\">Yeni Kategori Ekle</a></li>\n" +
"            <li role=\\\"separator\\\" class=\\\"divider\\\"></li>\n" +
"            <li><a href=\\\"#\\\">Kategorileri Listele</a></li>\n" +
"          </ul>\n" +
"        </li>\n" +
"          \n" +
"          <li><a href=\\\"#\\\">Yorumlar</a></li>\n" +
"      </ul>\n" +
"      \n" +
"      <ul class=\\\"nav navbar-nav navbar-right\\\">\n" +
"       \n" +
"        <li class=\\\"dropdown\\\">\n" +
"            <a href=\\\"#\\\" class=\\\"dropdown-toggle\\\" data-toggle=\\\"dropdown\\\" role=\\\"button\\\" aria-haspopup=\\\"true\\\" aria-expanded=\\\"false\\\"><%=session.getAttribute(\\\"un\\\")+\\\"\\\"%> <span class=\\\"caret\\\"></span></a>\n" +
"          <ul class=\\\"dropdown-menu\\\">\n" +
"            <li><a href=\\\"#\\\" id=\\\"linkSifreDegistir\\\">Şifre Değiştir</a></li>\n" +
"            <li role=\\\"separator\\\" class=\\\"divider\\\"></li>\n" +
"            <li><a href=\\\"exit.jsp\\\">Çıkış Yap</a></li>\n" +
"          </ul>\n" +
"        </li>\n" +
"      </ul>\n" +
"    </div><!-- /.navbar-collapse -->\n" +
"  </div><!-- /.container-fluid -->\n" +
"</nav>\n" +
"          <script>\n" +
"              $(\\\"#linkSifreDegistir\\\").click(function()\n" +
"              {\n" +
"                  $(\\\"#pwModal\\\").modal('show');\n" +
"              });\n" +
"              </script>\n" +
"    <!-- NAVBAR -->\n" +
"    \n" +
"    <div id=\\\"content\\\" style=\\\"margin-left:20px;margin-right: 20px\\\">";
    }

    public static String getPageEnd()
    {
        return "</div>\n" +
"    </div>\n" +
"          \n" +
"          \n" +
"          <!-- Modal -->\n" +
"<div style=\\\"margin-top:10%\\\" id=\\\"pwModal\\\" class=\\\"modal fade \\\" role=\\\"dialog\\\">\n" +
"  <div class=\\\"modal-dialog modal-sm\\\">\n" +
"\n" +
"    <!-- Modal content-->\n" +
"    <div class=\\\"modal-content\\\">\n" +
"      <div class=\\\"modal-header\\\">\n" +
"        <button type=\\\"button\\\" class=\\\"close\\\" data-dismiss=\\\"modal\\\">&times;</button>\n" +
"        <h4 class=\\\"modal-title\\\">Şifrenizi Değiştirin</h4>\n" +
"      </div>\n" +
"      <div class=\\\"modal-body\\\">\n" +
"        \n" +
"        \n" +
"        <div class=\\\"form-group\\\">\n" +
"            <label>Yeni Şifreniz : </label>\n" +
"            <input type=\\\"text\\\" id=\\\"pw\\\" name=\\\"pw\\\" class=\\\"form-control\\\" />\n" +
"        </div>\n" +
"          \n" +
"          \n" +
"      </div>\n" +
"      <div class=\\\"modal-footer\\\">\n" +
"        <button type=\\\"button\\\" id=\\\"btnSifreDegistir\\\" class=\\\"btn btn-default\\\" data-dismiss=\\\"modal\\\">TAMAM</button>\n" +
"      </div>\n" +
"          \n" +
"          <script>\n" +
"              $(\\\"#btnSifreDegistir\\\").click(function()\n" +
"              {\n" +
"                  var pw = $(\\\"#pw\\\").val();\n" +
"                  $.post(\\\"changePw.jsp\\\", {\\\"pw\\\":pw}, function(data,success)\n" +
"                  {\n" +
"                     var ne = $.trim(data);\n" +
"                     alert(ne);\n" +
"                     if (ne == \\\"OK\\\")\n" +
"                     {\n" +
"                        alert(\\\"Şifreniz Değiştirildi\\\"); \n" +
"                     }\n" +
"                  });\n" +
"              })\n" +
"          </script>\n" +
"    </div>\n" +
"  </div>\n" +
"</div>  \n" +
"</body>\n" +
"</html>";
    }
}
