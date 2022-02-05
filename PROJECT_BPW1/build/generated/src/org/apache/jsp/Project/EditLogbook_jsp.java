package org.apache.jsp.Project;

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

    String id_logbook = request.getParameter("id_logbook");
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"semantic/semantic.min.css\">\n");
      out.write("        <script\n");
      out.write("            src=\"https://code.jquery.com/jquery-3.1.1.min.js\"\n");
      out.write("            integrity=\"sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"semantic/semantic.min.js\"></script>\n");
      out.write("\n");
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
      out.write("    <h1>Form Edit</h1>\n");
      out.write("    <form class=\"ui form\">\n");
      out.write("        <div class=\"field\">\n");
      out.write("            <label>First Name</label>\n");
      out.write("            <input type=\"text\" name=\"first-name\" placeholder=\"First Name\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"field\">\n");
      out.write("            <label>Last Name</label>\n");
      out.write("            <input type=\"text\" name=\"last-name\" placeholder=\"Last Name\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"field\">\n");
      out.write("            <div class=\"ui checkbox\">\n");
      out.write("                <input type=\"checkbox\" tabindex=\"0\" class=\"hidden\">\n");
      out.write("                <label>I agree to the Terms and Conditions</label>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"ui button\" type=\"submit\">Submit</button>\n");
      out.write("    </form>\n");
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
