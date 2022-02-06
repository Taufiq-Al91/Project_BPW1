<%-- 
    Document   : OlahLogbook
    Created on : Feb 5, 2022, 1:07:17 PM
    Author     : LENOVO
--%>



<%@page import="java.io.*" %>
<%@page import ="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int id_logbook = Integer.parseInt(request.getParameter("id_logbook"));
    String username = request.getParameter("username");
    int id_peminjaman = Integer.parseInt(request.getParameter("id_peminjaman"));
    int no_pc = Integer.parseInt(request.getParameter("no_pc"));
    String keterangan = request.getParameter("keterangan");
    String status = request.getParameter("status");
   
   

  
    String host = "jdbc:mysql://localhost:3306/2tib_ganjil";
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, "root","");
        if (conn != null) {
            if (id_logbook != 0) {
                PreparedStatement pst = conn.prepareStatement("update logbook set id_logbook=?,"
                        + "username=?,id_peminjaman=?,no_pc=?,keterangan=?,status=? where id_logbook='" + id_logbook + "'");
                pst.setInt(1, id_logbook);
                pst.setString(2, username);
                pst.setInt(3, id_peminjaman);
                pst.setInt(4, no_pc);
                pst.setString(5, keterangan);
                pst.setString(6, status);
             
                pst.executeUpdate();

                response.sendRedirect("../view/Pesan.jsp");
            }
        } else {
            response.sendRedirect("../Modul12/gagalSimpanKurikulum.jsp");
        }
    } catch (SQLException ex) {
        out.print("Gagal Koneksi");
    } catch (Exception ex) {
        out.print(ex.getMessage());
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    </body>
</html>
