/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeoDAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modeloVO.tratamientoVO;
import util.conexion;
import util.interfaz;

/**
 *
 * @author nicolas silva
 */
public class tratamientoDAO extends conexion implements interfaz{
private Connection conexionBD = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    CallableStatement callsta;
    public int idTratamiento =0;
    public String nomtratamiento="";
    public String desTratamiento="";
    public int valTratamiento =0;
    public String estado="";
    private boolean operacion = false;
    public tratamientoDAO (tratamientoVO tratavo){
      super()  ;
        try {
             conexionBD = this.obtenerConection();
             puente =conexionBD.createStatement();
             idTratamiento=tratavo.getIdTratamiento();
             nomtratamiento=tratavo.getNomTratamiento();
             desTratamiento=tratavo.getDesTratamiento();
             valTratamiento=tratavo.getValTratamiento();
             estado=tratavo.getEstado();
        } catch (Exception e) {
            System.out.println("¡ERROR!"+e.toString());
        }
    }
    public tratamientoDAO (){
        
    }
    @Override
    public boolean AgregarRegistro() {
    try {
        callsta=conexionBD.prepareCall("CAll registroTratamiento(?,?,?,?) ");
        callsta.setString(1,nomtratamiento);
        callsta.setString(2,desTratamiento);
        callsta.setInt(3,valTratamiento);
        callsta.setString(4,estado);
        callsta.executeUpdate();
        operacion=true;
        this.cerrrarConexion();
    } catch (Exception e) {
        System.out.println("Error" + e.toString());
    }
       return operacion;
    }

    @Override
    public boolean ActualizarRegistro() {
          try {
        callsta=conexionBD.prepareCall("CAll actualozartratamiento(?,?,?,?) ");
        callsta.setString(1,nomtratamiento);
        callsta.setString(2,desTratamiento);
        callsta.setInt(3,valTratamiento);
        callsta.setString(4,estado);
        callsta.executeUpdate();
        operacion=true;
        this.cerrrarConexion();
    } catch (SQLException ex) {
        Logger.getLogger(tratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
       return operacion;
    }

    @Override
    public boolean ConsultarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean EliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public boolean validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
