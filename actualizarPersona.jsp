<%-- 
    Document   : actualizarPersona
    Created on : 18/09/2019, 03:18:57 PM
    Author     : APRENDIZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="Estilo.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <title>Actualizar Persona</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <%
            String id = request.getParameter("idPersona");
            String nombre = request.getParameter("nompersona");
            String apellido = request.getParameter("apepersona");
            String documento = request.getParameter("docpersona");
            String fecha = request.getParameter("fecpersona");
            String telefono = request.getParameter("telpersona");
            String correo = request.getParameter("corpersona");
            String tarjeta = request.getParameter("tarpersona");
            String estado = request.getParameter("estpersona");
        %>
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
    <center>
        <h1>Actualizar Persona</h1>

        <form action="Persona" method="post">
            <div style="border: 2px solid black; border-radius: 20px; width: 60%;">
                <label>Id:</label>
                <input type="text" name="txtidPersona" class="form-control" style="width: 40%;" value="<%=id%>"><br>
                <label>Nombre:</label>
                <input type="text" name="txtnomPersona" class="form-control" style="width: 40%;" value="<%=nombre%>"><br>
                <label>Apellido</label>
                <input type="text" name="txtapePersona" class="form-control" style="width: 40%;" value="<%=apellido%>"><br>
                <label>Documento:</label>
                <input type="text" name="txtdocPersona"class="form-control" style="width: 40%;" value="<%=documento%>"><br>
                <label>Fecha De Nacimiento:</label>
                <input type="text" name="txfecNacimiento"class="form-control" style="width: 40%;" value="<%=fecha%>"><br>
                <label>Telefono</label>
                <input type=text" name="txttelPersona"class="form-control" style="width: 40%;" value="<%=telefono%>"><br>
                <label>Correo</label>
                <input type="email" name="txtcorPersona" class="form-control" style="width: 40%;" value="<%=correo%>"><br>
                <label>Tarjeta Profesional</label>
                <input type="text" name="txttarProfesion" class="form-control" style="width: 40%;" value="<%=tarjeta%>"><br>
                <label>Estado</label>
                <input type="text" name="estActivo" class="form-control" style="width: 40%;" value="<%=estado%>"><br>
                <hr>
                <button class="btn btn-primary">Actualizar</button>
                <input type="hidden" value="2" name="opcion">

                <hr>
                <%
                if (request.getAttribute("MensajeError") != null) {%>
                <div class="alert alert-danger">
                    <strong>Error!</strong>${MensajeError}</div>
                    <%} else {%>

                ${MensajeExito}

                <%}%>
            </div>
        </form>

    </center>
</body>
</html>
