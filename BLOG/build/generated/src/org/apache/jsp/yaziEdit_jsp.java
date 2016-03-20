package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import blog.DB;

public final class yaziEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

  DB db = new DB();
  Object o = session.getAttribute("user_id");
  if (o == null)
  {
      response.sendRedirect("index.jsp");
      return;
  }
  
  String yaziId = request.getParameter("id");
  ResultSet rs = db.qWR("select * from yazilar where id = "+yaziId);
  rs.next();
  
  String yaziBaslik = rs.getString("baslik");
  String yaziKategorisi = rs.getString("kategori_id");
  String yaziYorumAcik = rs.getString("yorum_acik");
  String yaziIcerik = rs.getString("icerik");
    

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("   <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Yönetim</title>\r\n");
      out.write("        <meta charset=UTF-8\">\r\n");
      out.write("        <!-- JQUERY'I EKLE -->\r\n");
      out.write("        <script src=\"jq.js\"></script>\r\n");
      out.write("        <!-- BOOTSTRAP'I EKLE -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\" integrity=\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\" integrity=\"sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"te.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("        </head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("    <!-- NAVBAR -->\r\n");
      out.write("    <nav class=\"navbar navbar-default\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">MY BLOG</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <li class=\"dropdown\">\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Yazılar <span class=\"caret\"></span></a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a href=\"#\">Yeni Yazı Ekle</a></li>\r\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("            <li><a href=\"#\">Yazıları Listele</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li class=\"dropdown\">\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Kategoriler <span class=\"caret\"></span></a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a href=\"#\">Yeni Kategori Ekle</a></li>\r\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("            <li><a href=\"#\">Kategorileri Listele</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("          \r\n");
      out.write("          <li><a href=\"#\">Yorumlar</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      \r\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("       \r\n");
      out.write("        <li class=\"dropdown\">\r\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">");
      out.print(session.getAttribute("un")+"");
      out.write(" <span class=\"caret\"></span></a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a href=\"#\" id=\"linkSifreDegistir\">Şifre Değiştir</a></li>\r\n");
      out.write("            <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("            <li><a href=\"exit.jsp\">Çıkış Yap</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div><!-- /.navbar-collapse -->\r\n");
      out.write("  </div><!-- /.container-fluid -->\r\n");
      out.write("</nav>\r\n");
      out.write("          <script>\r\n");
      out.write("              $(\"#linkSifreDegistir\").click(function()\r\n");
      out.write("              {\r\n");
      out.write("                  $(\"#pwModal\").modal('show');\r\n");
      out.write("              });\r\n");
      out.write("              </script>\r\n");
      out.write("    <!-- NAVBAR -->\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"content\" style=\"margin-left:20px;margin-right: 20px\">\r\n");
      out.write("    <!-- CONTENT -->\r\n");
      out.write("    <div class=\"panel panel-success\">\r\n");
      out.write("        <div class=\"panel-heading\">\r\n");
      out.write("            <b>YENİ YAZI EKLE</b>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"panel-content\" style=\"padding:12px\">\r\n");
      out.write("            <form action=\"addYeniYazi.jsp\" method=\"post\" id=\"yaziGuncelleFormu\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label><b>Yazının Başlığı : </b></label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"baslik\" name=\"baslik\" value=\"");
      out.print(yaziBaslik);
      out.write("\" />\r\n");
      out.write("            </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label><b>Yorumlar Açılsın Mı : </b></label>\r\n");
      out.write("                    <select class=\"form-control\" name=\"yorumaAcik\" id=\"yorumaAcik\">\r\n");
      out.write("                        <option value=\"1\">Evet</option>\r\n");
      out.write("                        <option value=\"0\">Hayır</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label><b>Yazının Kategorisi : </b></label>\r\n");
      out.write("                    <select class=\"form-control\" name=\"kategori\" id=\"kategori\">\r\n");
      out.write("                        <option value=\"\">Seçiniz</option>\r\n");
      out.write("                        ");

                            ResultSet rsKat = db.qWR("select * from kategoriler");
                            while (rsKat.next())
                            {
                                int id = rsKat.getInt("id");
                                String ad = rsKat.getString("ad");
                                out.println("<option value='"+id+"'>"+ad+"</option>");
                            }
                        
                        
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label><b>Yazının İçeriği : </b></label>\r\n");
      out.write("                <textarea class=\"form-control editor\" id=\"icerik\" name=\"icerik\" style=\"width:100%;min-height: 350px\">");
      out.print(yaziIcerik);
      out.write("</textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"form-group text-right\">\r\n");
      out.write("                <input name=\"yaziSil\" id=\"yaziSil\" type=\"button\" value=\"YAZIYI SİL\" class=\"btn btn-lg btn-danger\" />\r\n");
      out.write("                <input name=\"yaziUpd\" id=\"yaziUpd\" type=\"button\" value=\"YAZIYI GÜNCELLE\" class=\"btn btn-lg btn-default\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <script>\r\n");
      out.write("                $(\"#yaziSil\").submit(function()\r\n");
      out.write("                {\r\n");
      out.write("                   var data = $(\"#yaziGuncelleFormu\").serialize();\r\n");
      out.write("                   alert(\"SİL : \"+data);\r\n");
      out.write("                   return false;\r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("                $(\"#yaziUpd\").submit(function()\r\n");
      out.write("                {\r\n");
      out.write("                   var data = $(\"#yaziGuncelleFormu\").serialize();\r\n");
      out.write("                   alert(\"UPD : \"+data);\r\n");
      out.write("                   return false;\r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("            </script>\r\n");
      out.write("                    \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- CONTENT -->\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          <!-- Modal -->\r\n");
      out.write("<div style=\"margin-top:10%\" id=\"pwModal\" class=\"modal fade \" role=\"dialog\">\r\n");
      out.write("  <div class=\"modal-dialog modal-sm\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Modal content-->\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("        <h4 class=\"modal-title\">Şifrenizi Değiştirin</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <label>Yeni Şifreniz : </label>\r\n");
      out.write("            <input type=\"text\" id=\"pw\" name=\"pw\" class=\"form-control\" />\r\n");
      out.write("        </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" id=\"btnSifreDegistir\" class=\"btn btn-default\" data-dismiss=\"modal\">TAMAM</button>\r\n");
      out.write("      </div>\r\n");
      out.write("          \r\n");
      out.write("          <script>\r\n");
      out.write("              $(document).ready(function()\r\n");
      out.write("              {\r\n");
      out.write("                  $(\"#kategori\").val(\"");
      out.print(yaziKategorisi);
      out.write("\");\r\n");
      out.write("                  $(\"#yorumaAcik\").val(\"");
      out.print(yaziYorumAcik);
      out.write("\");\r\n");
      out.write("              });\r\n");
      out.write("              $(\"#btnSifreDegistir\").click(function()\r\n");
      out.write("              {\r\n");
      out.write("                  var pw = $(\"#pw\").val();\r\n");
      out.write("                  $.post(\"changePw.jsp\", {\"pw\":pw}, function(data,success)\r\n");
      out.write("                  {\r\n");
      out.write("                     var ne = $.trim(data);\r\n");
      out.write("                     alert(ne);\r\n");
      out.write("                     if (ne == \"OK\")\r\n");
      out.write("                     {\r\n");
      out.write("                        alert(\"Şifreniz Değiştirildi\"); \r\n");
      out.write("                     }\r\n");
      out.write("                  });\r\n");
      out.write("              })\r\n");
      out.write("          </script>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>  \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
