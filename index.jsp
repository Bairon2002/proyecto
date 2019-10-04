<%-- 
    Document   : index
    Created on : 18/09/2019, 03:44:42 PM
    Author     : APRENDIZ
--%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <title>Login</title>
        <link href="Estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>


        <form action="Usuario" method="post" class="formulario contenedor text-white">
            <img class="img1" src="Logo_Proyecto.png"  alt="logo"/>
            <hr>
            <h1>Iniciar Sesión</h1>
            <hr>
            <label>Correo:</label>
            <input type="email" name="txtnomUsuario" class="form-control" placeholder="Ingrese Correo Electronico" required=""><br>
            <label>Contraseña:</label>
            <input type="password" name="txtpasUsuario" class="form-control" placeholder="Ingrese Contraseña" required=""><br>
            <label>Rol:</label>
            <select name="txtidRol" class="form-control">
                <option value="Medico">Medico</option>
                <option value="Cliente">Cliente</option>
                <option value="Proveedor">Proveedor</option>
            </select><br>
            <div>
                <button class="btn btn-primary">Ingresar</button><br>
                <input type="hidden" name="opcion" value="3">

                <hr>
                <%
                    if (request.getAttribute("MensajeError") != null) {%>
                <div class="alert alert-danger">
                    <strong>¡</strong>${MensajeError}<strong>!</strong></div>
                    <%} else {%>

                ${MensajeExito}

                <%}%>

            </div>

        </form>

    </body>
</html>