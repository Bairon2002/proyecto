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
import modeloVO.detallecitaVO;
import util.conexion;
import util.interfaz;

/**
 *
 * @author nicolas silva
 */
public class detallecitaDAO extends conexion implements interfaz{
private Connection conexionBD = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    CallableStatement callsta;
    public String Fecdetallepedidocita ;
    public int Idprdidocita ;
    public int idpersona ;
    public String estado ;
    private boolean operacion  = false;
    public detallecitaDAO (detallecitaVO detacitvo){
        super();
        try {
            conexionBD=this.obtenerConection();
            puente=conexionBD.createStatement();
            Fecdetallepedidocita=detacitvo.getFecdetallepedidocita();
            Idprdidocita=detacitvo.getIdprdidocita();
            idpersona=detacitvo.getIdpersona();
            estado=detacitvo.getEstado();
        } catch (Exception e) {
               System.out.println("¡ERROR!"+e.toString());
        }
    }
    @Override
    public boolean AgregarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
