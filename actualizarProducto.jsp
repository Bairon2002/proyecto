 <%-- 
    Document   : ActualizarProducto
    Created on : 23/08/2019, 02:22:31 AM
    Author     : nicolas silva
--%>

<%@page import="modeoDAO.productoDAO"%>
<%@page import="modeloVO.productoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <center>
        <body>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Menu</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link active" href="informacion_Personas.jsp">Persona<span class="sr-only"></span></a>
                    <a class="nav-item nav-link active" href="informacion_Medicamento.jsp">Medicamento<span class="sr-only"></span></a>
                    <a class="nav-item nav-link active" href="consultarProducto.jsp">Producto<span class="sr-only"></span></a>
                    <a class="nav-item nav-link active" href="agendacita.jsp">Cita<span class="sr-only"></span></a>
                    <a class="nav-item nav-link active" href="agregartratamiento.jsp">Tratamiento<span class="sr-only"></span></a>
                    
                </div>
            </div>
        </nav>
        <%
            productoVO productovo = new productoVO();
            productoDAO productodao = new productoDAO();
        %>
            <h1>Actualizar Producto</h1>
            <form action="Producto" method="post">
                <input type="hidden" name="idproducto" value="<%= productovo.getIdproducto()%>">
                nombre producto: 
                <input type="text" name="txtNombreProducto" value="<%= productovo.getNomProducto()%>"><br>
                tipo producto:
                <input type="text" name="txtTipoProducto" value="<%= productovo.getTipoProducto()%>"><br>
                valor:
                <input type="text" name="valor" value="<%= productovo.getValProducto()%>"><br>
                Estado:
                <select name="txtestado" value="<%= productovo.getEstado()%>">
                    <option value="activaa">activo</option>
                    <option value="cancelada">inactivada</option>
                </select>
                <input type="hidden" name="opcion" value=2>
                <button>Actualizar</button>
            </form>
            <%
                    if (request.getAttribute("MensajeError") != null) {%>
            ${MensajeError}
            <%} else {%>

            ${MensajeExito}

            <%}%>
        </body>
    </center>
</html>
