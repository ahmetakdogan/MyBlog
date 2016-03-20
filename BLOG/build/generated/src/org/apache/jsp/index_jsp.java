package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import blog.DB;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>MY BLOG</title>\r\n");
      out.write("        <meta charset=UTF-8\">\r\n");
      out.write("        <!-- JQUERY'I EKLE -->\r\n");
      out.write("        <script src=\"jq.js\"></script>\r\n");
      out.write("        <!-- BOOTSTRAP'I EKLE -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css\" integrity=\"sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\" integrity=\"sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
      out.write("        <style>\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("        </head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"container\" style=\"margin:30px;\">\r\n");
      out.write("    <div class=\"row\" >\r\n");
      out.write("        <div id=\"icerik_bolumu\" class=\"col-md-9\" >\r\n");
      out.write("            ");

                ResultSet rs = db.qWR("call sp_yazi_listesi()");
                
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
                
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"panel panel-success\">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("                            <b><a href=\"yazi.jsp?id=");
      out.print(yaziId);
      out.write("\" target=\"_blank\">");
      out.print(baslik);
      out.write("</a></b>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-content\" style=\"padding:12px; text-align:justify\">\r\n");
      out.write("                        ");
      out.print(tmp);
      out.write("\r\n");
      out.write("                        <a href=\"yazi.jsp?id=");
      out.print(yaziId);
      out.write("\" target=\"_blank\" ><b><u>Devamını Oku</u></b></a>\r\n");
      out.write("                                \r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"panel-footer\">\r\n");
      out.write("                        <table width=\"100%\">\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td align=\"left\" width=\"25%\">\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span>    \r\n");
      out.write("                                    <b>");
      out.print(yazar);
      out.write("</b></td>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <td align=\"center\"  width=\"25%\">\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-th\" aria-hidden=\"true\"></span>    \r\n");
      out.write("                                    <b>");
      out.print(kategori);
      out.write("</b></td>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <td align=\"center\"  width=\"25%\">\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-comment\" aria-hidden=\"true\"></span>    \r\n");
      out.write("                                    <b>");
      out.print(yorumSayisi);
      out.write("</b></td>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <td align=\"right\"  width=\"25%\">\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-time\" aria-hidden=\"true\"></span>    \r\n");
      out.write("                                    <b>");
      out.print(tarih);
      out.write("</b></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    ");

                }
                
                
                
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"sag_menu\" class=\"col-md-3\">\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"panel panel-warning\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <b>YÖNETİM</b>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"panel-content\" style=\"padding:12px;\">\r\n");
      out.write("                    <b><a href=\"#\" id=\"glp\">Giriş Yap</a></b>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"panel panel-warning\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <b>KATEGORILER</b>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"panel-content\" style=\"padding:12px;\">\r\n");
      out.write("                    ");

                        rs = db.qWR("select * from kategoriler");
                        while (rs.next())
                        {
                            String id = rs.getString("id");
                            String ad = rs.getString("ad");
                            String link = "kategoriYazilari.jsp?id="+id;
                            out.println("<b><a href=\""+link+"\" target=\"_blank\">"+ad+"</a><br>");
                        }
                    
                    
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"panel panel-warning\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <b>ARŞİVLER</b>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"panel-content\" style=\"padding:12px;\">\r\n");
      out.write("                    ");

                        rs = db.qWR("call sp_list_yazi_tarihleri()");
                        while (rs.next())
                        {
                            String ay = rs.getString("Ay");
                            String yil= rs.getString("Yil");
                            
                            String zaman = rs.getString("Liste");
                            
                            out.println("<b><a href=\"arsivYazilari.jsp?ay="+ay+"&yil="+yil+"\" target=\"_blank\">"+zaman+"</a><br>");
                        
                        }
                    
                    
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("                \r\n");
      out.write("            \r\n");
      out.write("                \r\n");
      out.write("                <div class=\"panel panel-warning\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <b>EN SON YAZILANLAR</b>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"panel-content\" style=\"padding:12px;\">\r\n");
      out.write("                    ");

                        rs = db.qWR("call sp_get_son_yazilar()");
                        while (rs.next())
                        {
                            String id = rs.getString("id");
                            String baslik = rs.getString("baslik");
                            String link = "yazi.jsp?id="+id;
                            out.println("<b><a href=\""+link+"\" target=\"_blank\">"+baslik+"</a><br>");
                        }
                    
                    
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div style=\"margin-top:10%\" id=\"loginModal\" class=\"modal fade \" role=\"dialog\">\r\n");
      out.write("  <div class=\"modal-dialog modal-sm\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Modal content-->\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("        <h4 class=\"modal-title\">Yönetici Girişi</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        \r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label>Username:</label>\r\n");
      out.write("            <input type=\"text\" id=\"un\" name=\"un\" class=\"form-control\" />\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <label>Password : </label>\r\n");
      out.write("            <input type=\"password\" id=\"pw\" name=\"pw\" class=\"form-control\" />\r\n");
      out.write("        </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" id=\"btnGiris\" class=\"btn btn-default\" data-dismiss=\"modal\">TAMAM</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script>\r\n");
      out.write("     $(\"#btnGiris\").click(function()\r\n");
      out.write("     {\r\n");
      out.write("            var un = $(\"#un\").val();\r\n");
      out.write("            var pw = $(\"#pw\").val();\r\n");
      out.write("            \r\n");
      out.write("            $.post(\"adminLogin.jsp\", { \"un\" : un, \"pw\" : pw }, function(data,success)\r\n");
      out.write("            {\r\n");
      out.write("               var gelen = $.trim(data);\r\n");
      out.write("               if (gelen == \"ERROR\")\r\n");
      out.write("                   location.href = \"index.jsp\";\r\n");
      out.write("               else\r\n");
      out.write("               {\r\n");
      out.write("                   location.href = \"yonetim.jsp\";\r\n");
      out.write("               }\r\n");
      out.write("            });\r\n");
      out.write("     }); \r\n");
      out.write("     </script>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>                \r\n");
      out.write("           \r\n");
      out.write("<script>\r\n");
      out.write("    $(\"#glp\").click(function()\r\n");
      out.write("    {\r\n");
      out.write("        $(\"#loginModal\").modal('show');\r\n");
      out.write("    });\r\n");
      out.write("    </script>\r\n");
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
