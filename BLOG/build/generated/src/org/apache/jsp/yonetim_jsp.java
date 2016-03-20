package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import blog.DB;

public final class yonetim_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css\">\r\n");
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
      out.write("            <li><a href=\"yaziEkle.jsp\">Yeni Yazı Ekle</a></li>\r\n");
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
      out.write("          <li><a href=\"yorumlar.jsp\">Yorumlar</a></li>\r\n");
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
      out.write("    \r\n");
      out.write("    <div class=\"panel panel-warning\">\r\n");
      out.write("        <div class=\"panel-heading\">\r\n");
      out.write("            <b>ARŞİVLER</b>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"panel-content\" style=\"padding:12px;\">\r\n");
      out.write("            ");

                ResultSet rs = db.qWR("call sp_get_stats");
                rs.next();
                int userCnt = rs.getInt("UserCnt");
                int katCnt = rs.getInt("KategoriCnt");
                int yaziCnt= rs.getInt("YaziCnt");
                int yorumCnt= rs.getInt("YorumCnt");
            
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"well well-lg\">\r\n");
      out.write("                        <table border=\"0\" width=\"100%\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td><i class=\"fa fa-users fa-5x\"></i></td>\r\n");
      out.write("                        <td align=\"right\"><h1><b>Kullanıcı</b></h1><h3>");
      out.print(userCnt);
      out.write("</h3></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                     </div>       \r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"well well-lg\">\r\n");
      out.write("                        <table border=\"0\" width=\"100%\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td><i class=\"fa fa-hashtag fa-5x\"></i></td>\r\n");
      out.write("                        <td align=\"right\"><h1><b>Kategori</b></h1><h3>");
      out.print(katCnt);
      out.write("</h3></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"well well-lg\">\r\n");
      out.write("                        <table border=\"0\" width=\"100%\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td><i class=\"fa fa-pencil-square-o fa-5x\"></i></td>\r\n");
      out.write("                        <td align=\"right\"><h1><b>Yazı</b></h1><h3>");
      out.print(yaziCnt);
      out.write("</h3></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"col-md-6\">\r\n");
      out.write("                    <div class=\"well well-lg\">\r\n");
      out.write("                        <table border=\"0\" width=\"100%\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td><i class=\"fa fa-comments fa-5x\"></i></td>\r\n");
      out.write("                        <td align=\"right\"><h1><b>Yorum</b></h1><h3>");
      out.print(yorumCnt);
      out.write("</h3></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
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
