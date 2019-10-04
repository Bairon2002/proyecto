/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeoDAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.sql.Result;
import modeloVO.productoVO;
import util.conexion;
import util.interfaz;

/**
 *
 * @author chebi
 */
public class productoDAO extends conexion implements interfaz {

    private Connection conexionBD = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    CallableStatement callsta;

    private int idproducto;
    private String nomProducto;
    private String tipoProducto;
    private String valProducto;
    private String estado;
    private boolean operacion = false;

    public productoDAO(productoVO ProductoVO) {
        super();
        try {
            conexionBD = this.obtenerConection();
            puente = conexionBD.createStatement();
            idproducto = ProductoVO.getIdproducto();
            nomProducto = ProductoVO.getNomProducto();
            tipoProducto = ProductoVO.getTipoProducto();
            valProducto = ProductoVO.getValProducto();
            estado = ProductoVO.getEstado();
        } catch (Exception e) {
            System.out.println("¡ERROR!" + e.toString());
        }
    }

    public productoDAO() {
    }

    @Override
    public  boolean ConsultarRegistro(){
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    @Override
    public boolean AgregarRegistro() {
        try {
            callsta = conexionBD.prepareCall("CALL registroProducto(?,?,?,?)");
            callsta.setString(1, nomProducto);
            callsta.setString(2, tipoProducto);
            callsta.setString(3, valProducto);
            callsta.setString(4, estado);
            callsta.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }
        return operacion;
    }

    @Override
    public boolean ActualizarRegistro() {
        try {
            callsta = conexionBD.prepareCall("CALL actualozarproducto(?,?,?,?)");
            callsta.setString(1, nomProducto);
            callsta.setString(2, tipoProducto);
            callsta.setString(3, valProducto);
            callsta.setString(4, estado);
            callsta.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }
        return operacion;
    }

    public ArrayList<productoVO> listarproductos() {
        conexion conexionBD = new conexion();
        ArrayList<productoVO> listarDatos = new ArrayList<>();
        try {
            callsta = conexionBD.obtenerConection().prepareCall("call listarProductos");
            mensajero = callsta.executeQuery();
            while (mensajero.next()) {
                idproducto = mensajero.getInt("idProducto");
                nomProducto = mensajero.getString("nomProducto");
                tipoProducto = mensajero.getString("tipProducto");
                valProducto = mensajero.getString("valProducto");
                estado = mensajero.getString("estado");
                productoVO productovo = new productoVO();
                productovo.setIdproducto(idproducto);
                productovo.setNomProducto(nomProducto);
                productovo.setTipoProducto(tipoProducto);
                productovo.setValProducto(valProducto);
                productovo.setEstado(estado);
                listarDatos.add(productovo);
            }
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }
        return listarDatos;
    }
    
    /* ArrayList< productoVO> DetalleProducto(String idProd) {

        ArrayList< productoVO> listaDetalles = null;
        productoVO Productovo;
        conexion ConexionBD;

        try {

            ConexionBD = new conexion();
            listaDetalles = new ArrayList<>();

            callsta = conexion.obtenerConexion().prepareCall("CALL listar_detalle_estudiante(?);");

            callStat.setString(1, idEst);

            resulConsulta = callStat.executeQuery();

            while (resulConsulta.next()) {

                nombre = resulConsulta.getString("nombre_estudiante");
                apellido = resulConsulta.getString("apellido_estudiante");
                grado = resulConsulta.getString("grado");
                fechaGestion = resulConsulta.getString("fecha_detalle_estudiante");
                descripcion = resulConsulta.getString("descripcion_detalle_estudiante");
                idProf = resulConsulta.getString("id_profesor");

                estudianteVO = new EstudianteVO();

                estudianteVO.setNombre(nombre);
                estudianteVO.setApellido(apellido);
                estudianteVO.setGrado(grado);
                estudianteVO.setFecha(fechaGestion);
                estudianteVO.setDescripcion(descripcion);
                estudianteVO.setIdProf(idProf);

                listaDetalles.add(estudianteVO);

            }

        } catch (SQLException e) {

            Logger.getLogger(EstudianteDAO.class
                    .getName()).log(Level.SEVERE, null, "Error: " + e);

        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException ex) {
                Logger.getLogger(EstudianteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return listaDetalles;

    }*/

    @Override
    public boolean EliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
