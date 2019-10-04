<%-- 
    Document   : informacion_Medicamento
    Created on : 29/09/2019, 01:42:43 PM
    Author     : Jean Gomez
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="modeloVO.MedicamentoVO"%>
<%@page import="modeoDAO.MedicamentoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <title>Medicamentos</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/responsive/2.2.3/css/responsive.bootstrap4.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
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
        <div class="text-center container">
            <h1 class="jumbotron">Medicamentos</h1>
            <table id="table_id" class="table table-striped table-bordered dt-responsive nowrap bg-light text-dark" style="width:100%">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Tipo</th>
                        <th>Via Consumo</th>
                        <th>Valor</th>
                        <th>Cantidad</th>
                        <th>Laboratorio</th>
                        <th>Estado</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        MedicamentoVO medicamentoVO = new MedicamentoVO();
                        MedicamentoDAO medicamentoDAO = new MedicamentoDAO();
                        ArrayList<MedicamentoVO> listaDatos = medicamentoDAO.listarMedicamento();

                        for (int i = 0; i < listaDatos.size(); i++) {
                            medicamentoVO = listaDatos.get(i);
                        }
                    %>
                    <tr>
                        <td><%= medicamentoVO.getNomMedicamento()%></td>

                        <td><%= medicamentoVO.getTipMedicamento()%></td>

                        <td><%= medicamentoVO.getConMedicamento()%></td>

                        <td><%= medicamentoVO.getValMedicamento()%></td>

                        <td><%= medicamentoVO.getStoMedicamento()%></td>

                        <td><%= medicamentoVO.getLabMedicamento()%></td>

                        <td><%= medicamentoVO.getEstado()%></td>
                        
                        <td><a><i class="fas fa-user-edit" title="Actualizar Medicamento"></i></a></td>
                    </tr>
                </tbody>
            </table>
                        <a href="Menu.jsp"><button class="btn btn-outline-primary">Volver</button></a>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js"></script>
        <script src="https://cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.min.js"></script>
        <script src="https://cdn.datatables.net/responsive/2.2.3/js/responsive.bootstrap4.min.js"></script>

        <script>
            $('#table_id').DataTable({

                "language": {
                    "lengthMenu": "Mostrar _MENU_ registros por pagina",
                    "zeroRecords": "No se encontraron resultados en su busqueda",
                    "searchPlaceholder": "Buscar registros",
                    "info": "Mostrando registros de _START_ al _END_ de un total de  _TOTAL_ registros",
                    "infoEmpty": "No existen registros",
                    "infoFiltered": "(filtrado de un total de _MAX_ registros)",
                    "search": "Buscar:",
                    "paginate": {
                        "first": "Primero",
                        "last": "Último",
                        "next": "Siguiente",
                        "previous": "Anterior"
                    }
                }
            });
        </script>

    </body>
</html>
