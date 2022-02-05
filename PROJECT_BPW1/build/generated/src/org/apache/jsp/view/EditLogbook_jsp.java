package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class EditLogbook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    int id_logbook = Integer.parseInt(request.getParameter("id_logbook"));
    String host = "jdbc:mysql://localhost:3306/2tib_ganjil";

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, "root", "");
        String query = "select * from logbook where id_logbook ='" + id_logbook + "'";
        Statement stmt = conn.createStatement();
        ResultSet rs = null;
        rs = stmt.executeQuery(query);
        while (rs.next()) {


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Hello Bulma!</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../asset/css/bulma.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.5/css/bulma.css\">\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("      body{\n");
      out.write("      padding: 0;\n");
      out.write("      margin: 0;\n");
      out.write("      }\n");
      out.write("      .hero{\n");
      out.write("      height: 150vh;\n");
      out.write("      position: relative;\n");
      out.write("      }\n");
      out.write("      .notification{\n");
      out.write("      padding-top: 20px;\n");
      out.write("      padding-bottom: 30px;\n");
      out.write("      }\n");
      out.write("      .button{\n");
      out.write("      margin-top: 10px;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <nav class=\"navbar is-black\" role=\"navigation\" aria-label=\"main navigation\">\n");
      out.write("        <div class=\"navbar-brand\">\n");
      out.write("            <a class=\"navbar-item\" href=\"https://bulma.io\">\n");
      out.write("                <img src=\"../asset/SIMLProjext.png\" width=\"90\" height=\"70\"  >\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <a role=\"button\" class=\"navbar-burger\" aria-label=\"menu\" aria-expanded=\"false\" data-target=\"navbarBasicExample\">\n");
      out.write("                <span aria-hidden=\"true\"></span>\n");
      out.write("                <span aria-hidden=\"true\"></span>\n");
      out.write("                <span aria-hidden=\"true\"></span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"navbarBasicExample\" class=\"navbar-menu\">\n");
      out.write("            <div class=\"navbar-start\">\n");
      out.write("                <a class=\"navbar-item\">\n");
      out.write("                    Beranda\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a class=\"navbar-item\">\n");
      out.write("                    Pengajuan\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a class=\"navbar-item\">\n");
      out.write("                    Laboratorium\n");
      out.write("                </a>\n");
      out.write("                <a class=\"navbar-item\">\n");
      out.write("                    Help\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("<body>\n");
      out.write("    <form action =\"olahedit_kurikulum.jsp\" method =\"post\">\n");
      out.write("    <div class=\"hero is-dark\">\n");
      out.write("      <div class=\"hero-body\">\n");
      out.write("          <h1 class=\"title has-text-centered is-size-2\"><B>FORM EDIT </B></h1>\n");
      out.write("        <div class=\"columns is-centered\">\n");
      out.write("          <div class=\"column is-half-desktop\">\n");
      out.write("            <div class=\"notification is-light\">\n");
      out.write("              <figure class=\"image container is-3by1\">\n");
      out.write("                  <img src=\"../asset/SIMLProjext.png\" height=\"300\" width=\"300\" >\n");
      out.write("              </figure>\n");
      out.write("              <div class=\"field\">\n");
      out.write("                \n");
      out.write("                <label class=\"label\">ID Logbook</label>\n");
      out.write("                <p>\n");
      out.write("                  <input class=\"input\" type=\"text\" name=\"id_logbook\" value=\"");
      out.print(rs.getInt("id_logbook"));
      out.write("\"/> \n");
      out.write("                 \n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("                  <div class=\"field\">\n");
      out.write("                <label class=\"label\">ID Peminjaman</label>\n");
      out.write("                <p>\n");
      out.write("                  <input class=\"input\" type=\"text\" name=\"id_peminjaman\" value=\"");
      out.print(rs.getInt("id_peminjaman"));
      out.write("\"/> \n");
      out.write("                  \n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("                  <div class=\"field\">\n");
      out.write("                <label class=\"label\">No PC</label>\n");
      out.write("                <p>\n");
      out.write("                  <input class=\"input\" type=\"text\" name=\"no_pc\" value=\"");
      out.print(rs.getInt("no_pc"));
      out.write("\"/> \n");
      out.write("                  \n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("                   <div class=\"field\">\n");
      out.write("                <label class=\"label\">Keterangan</label>\n");
      out.write("                <p>\n");
      out.write("                  <input class=\"input\" type=\"text\" name=\"keterangan\" value=\"");
      out.print(rs.getString("keterangan"));
      out.write("\"/> \n");
      out.write("                  \n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("                   <div class=\"field\">\n");
      out.write("                <label class=\"label\">Status</label>\n");
      out.write("                <p>\n");
      out.write("                  <input class=\"input\" type=\"text\" name=\"status\" value=\"");
      out.print(rs.getString("status"));
      out.write("\"/> \n");
      out.write("                  \n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("              <input class=\"button is-info is-rounded is-outlined is-medium\" type=\"submit\" value=\"Update\">\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("    ");
}
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            out.print("Gagal Koneksi");
        } catch (Exception ex) {
            out.print(ex.getMessage());
        }
    
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write(" ");
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
