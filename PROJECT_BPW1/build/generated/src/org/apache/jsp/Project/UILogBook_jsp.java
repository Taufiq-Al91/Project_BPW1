package org.apache.jsp.Project;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.DriverManager;

public final class UILogBook_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String host = "jdbc:mysql://localhost:3306/2tib_ganjil";
    try {

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, "root", "");
        String query = "SELECT * FROM logbook";
        Statement stmt = conn.createStatement();
        ResultSet rs = null;
        rs = stmt.executeQuery(query);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Blacklist LogBook</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../asset/css/bulma.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <nav class=\"navbar is-black\" role=\"navigation\" aria-label=\"main navigation\">\n");
      out.write("            <div class=\"navbar-brand\">\n");
      out.write("                <a class=\"navbar-item\" href=\"https://bulma.io\">\n");
      out.write("                    <img src=\"../asset/SIMLProjext.png\" width=\"90\" height=\"70\"  >\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a role=\"button\" class=\"navbar-burger\" aria-label=\"menu\" aria-expanded=\"false\" data-target=\"navbarBasicExample\">\n");
      out.write("                    <span aria-hidden=\"true\"></span>\n");
      out.write("                    <span aria-hidden=\"true\"></span>\n");
      out.write("                    <span aria-hidden=\"true\"></span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"navbarBasicExample\" class=\"navbar-menu\">\n");
      out.write("                <div class=\"navbar-start\">\n");
      out.write("                    <a class=\"navbar-item\">\n");
      out.write("                        Beranda\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    <a class=\"navbar-item\">\n");
      out.write("                        Pengajuan\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    <a class=\"navbar-item\">\n");
      out.write("                            Laboratorium\n");
      out.write("                        </a>\n");
      out.write("                    <a class=\"navbar-item\">\n");
      out.write("                            Help\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"table is-bordered is-striped is-narrow is-hoverable is-fullwidth\">\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <table border=\"1\" width=\"1000px\" align=\"center\" >\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>ID LogBook</b></td>\n");
      out.write("                    <td><b>ID Peminjam</b></td>\n");
      out.write("                    <td><b>No. Pc</b></td>\n");
      out.write("                    <td><b>Keterangan</b></td>\n");
      out.write("                    <td><b>Status</b></td>\n");
      out.write("                    <td><b>Aksi</b></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");
 while (rs.next()) {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(rs.getInt("id_logbook"));
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print(rs.getInt("id_peminjaman"));
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print(rs.getInt("no_pc"));
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print(rs.getString("keterangan"));
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print(rs.getString("status"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td><a href=\"../Project/EditLogbook.jsp?id_logbook=");
      out.print(rs.getString("id_logbook"));
      out.write("\"\n");
      out.write("                           >Edit</a> | <a href=\"../Modul12/delete_kurikulum.jsp?kode_mk=");
      out.print(rs.getString("id_logbook"));
      out.write("\"\n");
      out.write("                           >Delete </a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        ");

                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                out.print("Gagal koneksi");
            } catch (Exception ex) {
                out.print(ex.getMessage());
            }
        
      out.write("\n");
      out.write("        </br>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
