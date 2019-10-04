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
import modeloVO.pedidocitaVO;
import util.conexion;
import util.interfaz;

/**
 *
 * @author nicolas silva
 *
 * para que se guarde
 */
public class pedidocitaDAO extends conexion implements interfaz {

    private Connection conexionBD = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    CallableStatement callsta ;
    public String Fecpedidocita;
    public String estado;
    private boolean operacion = false;

    public pedidocitaDAO(pedidocitaVO pedivo) {
        super();
        try {
            conexionBD = this.obtenerConection();
            puente = conexionBD.createStatement();
            Fecpedidocita = pedivo.getFecpedidocita();
            estado = pedivo.getEstado();
        } catch (Exception e) {
            System.out.println("¡ERROR!" + e.toString());
        }
    }

    @Override
    public boolean AgregarRegistro() {
        try {
            callsta=conexionBD.prepareCall("CALL registropedidocita(?,?)");
            callsta.setString(1,Fecpedidocita);
            callsta.setString(2,estado);
             callsta.executeUpdate();
            operacion = true;
            this.cerrrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(pedidocitaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return operacion;
    }

    @Override
    public boolean ActualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
