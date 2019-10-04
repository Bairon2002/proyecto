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
import modeloVO.UsuarioVO;
import util.conexion;
import util.interfaz;

/**
 *
 * @author APRENDIZ
 */
public class UsuarioDAO extends conexion implements interfaz {

    //Conexion
    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    CallableStatement callStat;

    //Variables que se van a manejar
    
    private String nomUsuario = "";
    private String pasUsuario = "";
    private String idRol = "";
    private String Idpersona = "";
    private String estado = "";

    private boolean operacion = false;

    public UsuarioDAO(UsuarioVO usuVo) {
        super();

        try {

            conexion = this.obtenerConection();
            puente = conexion.createStatement();

            
            nomUsuario = usuVo.getNomUsuario();
            pasUsuario = usuVo.getPasUsuario();
            idRol = usuVo.getIdRol();
            Idpersona = usuVo.getIdpersona();
            estado = usuVo.getEstado();

        } catch (Exception e) {

            System.out.println("Error!" + e.toString());
        }
    }

    @Override
    public boolean AgregarRegistro() {
        try {
            callStat = conexionBD.prepareCall("call registroUsuario(?,?,?,?,?)");
            
            callStat.setString(1, nomUsuario);
            callStat.setString(2, pasUsuario);
            callStat.setString(3, idRol);
            callStat.setString(4, Idpersona);
            callStat.setString(5, estado);

            callStat.executeUpdate();

            operacion = true;
            this.cerrrarConexion();
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }
        return operacion;
    }

    @Override
    public boolean ActualizarRegistro() {
        try {
            callStat = conexionBD.prepareCall("call actualizousuari(?,?,?,?,?,?)");
            callStat.setString(1, nomUsuario);
            callStat.setString(2, pasUsuario);
            callStat.setString(3, idRol);
            callStat.setString(4, Idpersona);
            callStat.setString(5, estado);

            callStat.executeUpdate();

            operacion = true;
            this.cerrrarConexion();
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }
        return operacion;
    }
    public ArrayList<UsuarioVO> listarUsuarios(){
        conexion conn = new  conexion();
        ArrayList<UsuarioVO> listaDatos = new ArrayList<>();
        try {
            callStat = conn.obtenerConection().prepareCall("call listarUsuarios");
            mensajero=callStat.executeQuery();
            while (mensajero.next()) {
                
               
                
            }
        } catch (Exception e) {
        }
        return listaDatos;
    } 

    @Override
    public boolean ConsultarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean EliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean ValidarAcceso(String nomUsuario, String pasUsuario, String idRol){
        try {
          conexion = this.obtenerConection();
            puente =  conexion.createStatement();
            
             mensajero = puente.executeQuery("Select * From usuario where nomUsuario = '"+ nomUsuario +"' and pasUsuario='"+pasUsuario+"' and idRol='"+idRol+"'");
             
             if (mensajero.next()) {
                operacion = true;
            }
            this.cerrrarConexion();
            
        } catch (Exception e) {
            System.out.println("Â¡Error!"+ e.toString());
        }
        return operacion;
    }

}
