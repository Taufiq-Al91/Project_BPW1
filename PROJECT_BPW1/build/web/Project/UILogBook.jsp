<%-- 
    Document   : UILogBook
    Created on : Feb 5, 2022, 8:59:38 AM
    Author     : LENOVO
--%>

<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String host = "jdbc:mysql://localhost:3306/2tib_ganjil";
    try {

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, "root", "");
        String query = "SELECT * FROM logbook";
        Statement stmt = conn.createStatement();
        ResultSet rs = null;
        rs = stmt.executeQuery(query);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Blacklist LogBook</title>
        <link rel="stylesheet" href="../asset/css/bulma.css">
        
    </head>
    <nav class="navbar is-black" role="navigation" aria-label="main navigation">
            <div class="navbar-brand">
                <a class="navbar-content" href="https://bulma.io">
                    <img src="../asset/SIMLProjext.png" width="100" height="80"  >
                </a>

                <a role="button" class="navbar-burger" aria-label="menu" aria-expanded="false" data-target="navbarBasicExample">
                    <span aria-hidden="true"></span>
                    <span aria-hidden="true"></span>
                    <span aria-hidden="true"></span>
                </a>
            </div>

            <div id="navbarBasicExample" class="navbar-menu">
                <div class="navbar-start">
                    <a class="navbar-item">
                        Beranda
                    </a>

                    <a class="navbar-item">
                        Pengajuan
                    </a>

                    <a class="navbar-item">
                            Laboratorium
                        </a>
                    <a class="navbar-item">
                            Help
                        </a>

                       
                    </div>
                </div>

                
            </div>
        </nav>
    <body>
        <br>
        
        <h4 class="title is-4" align="center"><B>LIST LOGBOOK</B></h4>
        <div class="table is-bordered is-striped is-narrow is-hoverable is-fullwidth">
           
            
            <table border="1" width="1000px" align="center" >
                <tr>
                    <td><b>ID LogBook</b></td>
                    <td><b>ID Peminjam</b></td>
                    <td><b>No. Pc</b></td>
                    <td><b>Keterangan</b></td>
                    <td><b>Status</b></td>
                    <td><b>Aksi</b></td>

                </tr>
                <% while (rs.next()) {%>
                <tr>
                    <td><%=rs.getInt("id_logbook")%></td>
                    <td> <%=rs.getInt("id_peminjaman")%></td>
                    <td> <%=rs.getInt("no_pc")%></td>
                    <td> <%=rs.getString("keterangan")%></td>
                    <td> <%=rs.getString("status")%></td>

                    <td><a href="view/EditLogbook.jsp?id_logbook=<%=rs.getString("id_logbook")%>"
                           >Edit</a> | <a href="../Modul12/delete_kurikulum.jsp?kode_mk=<%=rs.getString("id_logbook")%>"
                           >Delete </a></td>
                </tr>
                <% } %>
            </table>
        </div>
        <%
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                out.print("Gagal koneksi");
            } catch (Exception ex) {
                out.print(ex.getMessage());
            }
        %>
        </br>
       
    </body>

</html>

