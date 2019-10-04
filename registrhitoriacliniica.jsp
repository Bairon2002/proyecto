<%-- 
    Document   : registrhitoriacliniica
    Created on : 24/09/2019, 08:10:37 AM
    Author     : nicolas silva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Historia Clinica</h1>
        <form action="hiscli" method="post">
            <label>fecha:</label><br>
            <input type="datetime-local" name="txtgecha"><br>
            <label>persona:</label><br>
            <input type="text" name="txtpersona"><br>
            <label>cita:</label><br>
            <input type="text" name="txtcita"><br>
            <label>Estado:</label><br>
            <select name="txtestado" class="form-control">
                <option value="Activo">activo</option>
                <option value="Inactivo">inactivada</option>
            </select>
            <input type="hidden" name="opcion" value="1">
            <button>Registrar</button>
        </form>
          <%
            if (request.getAttribute("MensajeError") != null) {%>
        ${MensajeError}
        <%} else {%>

        ${MensajeExito}

        <%}%>
    </body>
</html>
