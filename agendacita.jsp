<%--
/*la idea es que carguen los tratamientos que ya estan registrados en la tabla tratamiento */
    Document   : agendacita
    Created on : 24/09/2019, 08:07:07 AM
    Author     : nicolas silva
--%>

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
        <h1>Agende su cita</h1>
        <form action="Cita" method="post"
              <label>fecha:</label><br>
            <input type="datetime-local" name="txtfecha" class="form-control"><br>
            <input type="text "name="txtTratamiento" class="form-control">
                
            <select name="txtestado" class="form-control">
                <option value="Activo">activo</option>
                <option value="Inactivo">inactivada</option>
            </select>

            <button>Agendar</button>
            <input type="hidden" name="opcion" value="1">
            <a href="registrhitoriacliniica.jsp"><button class="btn btn-primary">Historia Clinica</button></a>

            <a href="Menu.jsp"><button class="btn btn-outline-primary">Volver</button></a>
        </form>
         <%
            if (request.getAttribute("MensajeError") != null) {%>
        ${MensajeError}
        <%} else {%>

        ${MensajeExito}

        <%}%>
    </body>
</html>
