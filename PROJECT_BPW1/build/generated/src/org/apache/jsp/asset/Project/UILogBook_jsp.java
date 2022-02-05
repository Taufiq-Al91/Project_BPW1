package org.apache.jsp.asset.Project;

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
      out.write("\n");

    String host = "jdbc:mysql://localhost:3306/2tib_ganjil";
    try {

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, "root", "");
        String query = "select * from logbook";
        Statement stmt = conn.createStatement();
        ResultSet rs = null;
        rs = stmt.executeQuery(query);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Hello Bulma!</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <body style=\"background-color: whitesmoke\">\n");
      out.write("        <h1> Kurikulum PCR</h1>\n");
      out.write("        <div class=\"table is-fullwidth\">\n");
      out.write("            <table border=\"1\" style=\"background-color: whitesmoke\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>ID LogBook</td>\n");
      out.write("                    <td>ID Peminjam</td>\n");
      out.write("                    <td>NO. Pc</td>\n");
      out.write("                    <td>Keterangan</td>\n");
      out.write("                    <td>Status</td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");
 while (rs.next()) {
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td> ");
      out.print(rs.getInt("id_logbook"));
      out.write("</td>\n");
      out.write("                    <td> ");
      out.print(rs.getInt("id_peminjam"));
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
      out.write("                    <td><a href=\"../Modul12/edit_kurikulum.jsp?kode_mk=");
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
      out.write("        <a href=\"../Modul12/input_kurikulum.jsp\">Add NewData</a>\n");
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
