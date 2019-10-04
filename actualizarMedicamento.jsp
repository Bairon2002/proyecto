<%-- 
    Document   : actualizarMedicamento
    Created on : 18/09/2019, 03:24:51 PM
    Author     : APRENDIZ
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <title>Actualizar Medicamento</title>
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
    <center>
        <h1>Actualizar Medicamento</h1>
        <form action="Persona" method="post">
            <label>Nombre:</label>
            <input type="text" name="txtnomMedicamento" class="form-control"><br>
            <label>Tipo:</label>
            <input type="text" name="txttipMedicamento" class="form-control"><br>
            <label>Consumo:</label>
            <input type="text" name="txtconMedicamento" class="form-control"><br>
            <label>Valor:</label>
            <input type="number" name="txtvalMedicamento" class="form-control"><br>
            <label>Cantidad</label>
            <input type="number" name="txtStoMedicamento" class="form-control"><br>
            <label>Laboratorio:</label>
            <input type="text" name="txtlabMedicamento" class="form-control"><br>
            
            <button class="btn btn-primary">Actualizar</button>
            <input type="hidden" value="2">
        </form>
        <%
            if (request.getAttribute("MensajeError") != null) {%>
        ${MensajeError}
        <%} else {%>

        ${MensajeExito}

        <%}%>
    </center>
</body>
</html>