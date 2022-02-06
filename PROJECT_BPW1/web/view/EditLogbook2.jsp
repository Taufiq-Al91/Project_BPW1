<%-- 
    Document   : EditLogbook
    Created on : Dec 14, 2021, 8:42:34 AM
    Author     : LAB329-PC05
--%>

<%@page import="java.io.*" %>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
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

%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Hello Bulma!</title>
        <link rel="stylesheet" href="../asset/css/bulma.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.5/css/bulma.css">
        <style type="text/css">
            body{
                padding: 0;
                margin: 0;
            }
            .hero{
                height: 150vh;
                position: relative;
            }
            .notification{
                padding-top: 20px;
                padding-bottom: 30px;
            }
            .button{
                margin-top: 10px;
            }
        </style>


    </head>
    <nav class="navbar is-black" role="navigation" aria-label="main navigation">
        <div class="navbar-brand">
            <a class="navbar-item" href="https://bulma.io">
                <img src="../asset/SIMLProjext.png" width="90" height="70"  >
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
    <form action ="../controller/OlahLogBook.jsp" method ="post"> 
        <div class="hero is-dark">
            <div class="hero-body">
                <h1 class="title has-text-centered is-size-2"><B>FORM EDIT </B></h1>
                <div class="columns is-centered">
                    <div class="column is-half-desktop">
                        <div class="notification is-light">
                            <figure class="image container is-3by1">
                                <img src="../asset/SIMLProjext.png" height="300" width="300" >
                            </figure>
                            <fieldset disable>
                                <div class="field">

                                    <label class="label">ID Logbook</label>

                                    <p>
                                    <div class="control">
                                        <input class="input" type="text" name="id_logbook" value="<%=rs.getInt("id_logbook")%>"/> 

                                        </p>
                                    </div>

                                </div>

                                <div class="field">
                                    <label class="label">ID Peminjaman</label>
                                    <p>
                                    <div class="control">
                                        <input class="input" type="text" name="id_peminjaman" value="<%=rs.getInt("id_peminjaman")%>"/> 

                                        </p>
                                    </div>
                                </div>

                            </fieldset>
                            <div class="field">
                                <label class="label">No PC</label>
                                <p>
                                    <input class="input" type="text" name="no_pc" value="<%=rs.getInt("no_pc")%>"/> 

                                </p>
                            </div>
                            <div class="field">
                                <label class="label">Keterangan</label>
                                <p>
                                    <input class="input" type="text" name="keterangan" value="<%=rs.getString("keterangan")%>"/> 

                                </p>
                            </div>
                            <div class="field">

                                <label class="label">Status</label>
                                <p>
                                     <div class="field has-addons">
                                <div class="control is-expanded">
                                    <div class="select is-fullwidth">
                                        <select name="status">
                                            <option value="whitelist">whitelist</option>
                                            <option value="blacklist">blacklist</option>

                                        </select>
                                    </div>
                                </div>
                              
                            </div>

                                </p>
                            </div>
                           


                            <input class="button is-info is-rounded is-outlined is-medium" type="submit" value="Update">

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </form>


    <%}
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            out.print("Gagal Koneksi");
        } catch (Exception ex) {
            out.print(ex.getMessage());
        }
    %>

</body>
</html>


