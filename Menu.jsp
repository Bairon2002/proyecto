<%-- 
    Document   : Menu
    Created on : 22/09/2019, 05:31:17 PM
    Author     : Jean Gomez

Consultab citas registra historial
crus tratamiento 
--%>
<%
response.setHeader("Pragma", "no-cache");
response.setHeader("Cache-control", "must-revalidate");
response.setHeader("Cache-control", "no-cache");
response.setHeader("Cache-control", "no-cache");
response.setDateHeader("Expires", 0);


%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <img src="Logo_Proyecto.png" class="img"> &nbsp; &nbsp; &nbsp;
            <a class="navbar-brand" href="#">Menu</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link active" href="informacion_Personas.jsp">Persona<span class="sr-only"></span></a>
                    <a class="nav-item nav-link active" href="informacion_Medicamento.jsp">Citas<span class="sr-only"></span></a>
                    <a class="nav-item nav-link active" href="consultarProducto.jsp">Historial<span class="sr-only"></span></a>
                    <a class="nav-item nav-link active" href="agendacita.jsp">Tratamiento<span class="sr-only"></span></a>
                    
                                        <a href="actualizarUsuario.jsp"><i class="fas fa-user-cog" title="Actualizar Usuario"></i></a>

                                        <a class="btn btn-outline-danger" href="">Cerrar Sesion</a> 

                </div>
            </div>
        </nav>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <style>
            .img{
                max-width: 150px;

            }
        </style>
    </body>

</html>
