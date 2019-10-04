<%-- 
    Document   : registrarPersona
    Created on : 18/09/2019, 03:00:00 PM
    Author     : APRENDIZ
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
        <title>Registrar Persona</title>
        <link href="Estilo.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
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
                    <a class="nav-item nav-link active" href="informacion_Medicamento.jsp">Medicamento<span class="sr-only"></span></a>
                    <a class="nav-item nav-link active" href="consultarProducto.jsp">Producto<span class="sr-only"></span></a>
                    <a class="nav-item nav-link active" href="agendacita.jsp">Cita<span class="sr-only"></span></a>
                    <a class="nav-item nav-link active" href="agregartratamiento.jsp">Tratamiento<span class="sr-only"></span></a>
                    <a class="btn btn-outline-danger" href="">Cerrar Sesion</a>
                </div>
            </div>
        </nav>


        <form action="Persona" method="post" class="formulario contenedor text-white" >
            <h1>Registrar Persona</h1>
            <hr>
            
                <label>Nombre:</label>
                <input type="text" name="txtnomPersona" class="form-control" pattern="[a-zA-Z_ñá-ú]{1,20}" maxlength="20" placeholder="Ingrese Nombre" required=""><br>
                <label>Apellido:</label>
                <input type="text" name="txtapePersona"class="form-control" placeholder="Ingrese Apellido"required=""><br>
                <label>Documento:</label>
                <input type="number" name="txtdocPersona" class="form-control" placeholder="Ingrese Documento" required=""><br>
                <label>Fecha De Nacimiento:</label>
                <input type="text" name="txfecNacimiento" class="form-control" placeholder="Ingrese Fecha De Nacimiento" required=""><br>
                <label>Telefono:</label>
                <input type="number" name="txttelPersona" class="form-control" pattern="[0-9]{1,15}" maxlength="15" placeholder="Ingrese Numero De Telefono" required=""><br>
                <label>Correo Electronico:</label>
                <input type="email" name="txtcorPersona"class="form-control" placeholder="Ingrese Correo Electronico" required=""><br>
                <label>Tarjeta Profesional:</label>
                <select name="txttarProfesion" class="form-control" autocomplete="off" required="">
                    <option selected>Elige...</option>
                    <option value="Medico">Medico</option>
                    <option value="Cliente">Cliente</option>
                    <option value="Proveedor">Proveedor</option>
                </select><br>

                <a href="informacion_Personas.jsp"><button class="btn btn-primary">Registrar</button></a>
                <input type="hidden" name="opcion" value="1">
                <input type="hidden" name="estActivo" value="Activo">
                <hr>
                <%
            if (request.getAttribute("MensajeError") != null) {%>
        <div class="alert alert-danger">
            <strong>Error!</strong>${MensajeError}</div>
            <%} else {%>

        ${MensajeExito}

        <%}%>
            
        </form>
        

        <style>
            .img{
                max-width: 150px;

            }
        </style>
    </body>
</html>
