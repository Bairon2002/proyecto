%-- 
    Document   : Consultar_Observador
    Created on : 09-sep-2019, 17:50:05
    Author     : Windows 10
--%>

<%@page import="java.util.ArrayList"%>

<%HttpSession sesion = (HttpSession) request.getSession();

    if (sesion.getAttribute("rolUsu") == null) {

        response.sendRedirect("index.jsp");

    }%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Consultar Estudiante</title>

        <link rel="stylesheet" href="CSS/estilos.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/responsive/2.2.3/css/responsive.bootstrap4.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

    </head>
    <body>

        <%
            String idEst = request.getParameter("idEst");
        %>
        <div class="container text-center py-4 text-white">
            <table id="table_id" class="table table-striped table-bordered dt-responsive nowrap bg-light text-dark m-auto" style="width: 77%;">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Grado</th>
                        <th>Fecha y Hora</th>
                        <th>Descripcion</th>
                        <th>ID Profesor</th>
                        <th>Imprimir</th>
                    </tr>
                </thead>
                <tbody>
                    <%

                      //  EstudianteVO estudianteVO = new EstudianteVO();
                        //EstudianteDAO estudianteDAO = new EstudianteDAO();
                        //ArrayList<EstudianteVO> listarDetalles = estudianteDAO.listarDetallesEstudiante(idEst);
                        //for (int i = 0; i < listarDetalles.size(); i++) {
                           // estudianteVO = listarDetalles.get(i);

                    %>

                    <tr>

                        ///*<td>
                          //  //<%= estudianteVO.getNombre()%>
                        //</td>
                        <td>
                           // //<%= estudianteVO.getApellido()%>
                        </td>
                        <td>
                            //<%= estudianteVO.getGrado()%>
                        </td>
                        <td>
                            <%= estudianteVO.getFecha() %>
                        </td>
                        <td>
                            <%= estudianteVO.getDescripcion() %>
                        </td>
                        <td>
                            <a href="Perfil_Profesor.jsp?id=<%= estudianteVO.getIdProf() %>" title="Ver perfil de Profesor"><%= estudianteVO.getIdProf() %></a>
                        </td>
                        <td><input type="button" value="Imprimir" onclick="javascript:window.print()" /></td>

                    </tr>

                    <%}%>
                </tbody>
            </table>
            <input type="hidden" id="usuRol" value="<%= sesion.getAttribute("rolUsu")%>">
        </div><br>
        <footer id="sticky-footer" class="py-4 bg-light text-dark">
            <div class="container text-center">
                <p>Colegio Enrique Olaya Herrera &COPY;</p>
                <p>Colegio Enrique Olaya Herrera<br /> Tels: (571) 361 4147 - 361 4146 / Cra. 10 No. 31 - 29 Sur / Bogotá D.C. Colombia</p>
                <a href="https://www.facebook.com/enriqueolayah?ref=ts&fref=ts"><i class="fab fa-facebook-square icons"></i></a>
                <a href="https://twitter.com/colegioeoh"><i class="fab fa-twitter-square icons"></i></a>
            </div>
        </footer>
    </body>

</html>
