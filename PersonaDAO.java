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
import java.util.ArrayList;
import modeloVO.PersonaVO;
import util.conexion;
import util.interfaz;

/**
 *
 * @author APRENDIZ
 */
public class PersonaDAO extends conexion implements interfaz {

    //Conexion
    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    CallableStatement callStat;

    //Variables que se van a manejar
    private String idpersona = "";
    private String nomPersona = "";
    private String apePersona = "";
    private String docPersona = "";
    private String fecNacimiento = "";
    private String telPersona = "";
    private String corPersona = "";
    private String tarProfesion = "";
    private String estado = "";

    private boolean operacion = false;

    public PersonaDAO() {
    }
    
    

    public PersonaDAO(PersonaVO perVO) {
        super();
        try {

            conexion = this.obtenerConection();
            puente = conexion.createStatement();

            idpersona = perVO.getIdpersona();
            nomPersona = perVO.getNomPersona();
            apePersona = perVO.getApePersona();
            docPersona = perVO.getDocPersona();
            fecNacimiento = perVO.getFecNacimiento();
            telPersona = perVO.getTelPersona();
            corPersona = perVO.getCorPersona();
            tarProfesion = perVO.getTarProfesion();
            estado = perVO.getEstado();

        } catch (Exception e) {

            System.out.println("Error!" + e.toString());
        }
    }

    @Override
    public boolean AgregarRegistro() {
        try {
            callStat = conexionBD.prepareCall("call registroPersona(?,?,?,?,?,?,?,?)");

            callStat.setString(1, nomPersona);
            callStat.setString(2, apePersona);
            callStat.setString(3, docPersona);
            callStat.setString(4, fecNacimiento);
            callStat.setString(5, telPersona);
            callStat.setString(6, corPersona);
            callStat.setString(7, tarProfesion);
            callStat.setString(8, estado);
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
            callStat = conexionBD.prepareCall("call actualozarpersona(?,?,?,?,?,?,?,?,?)");
            callStat.setString(1, idpersona);
            callStat.setString(2, nomPersona);
            callStat.setString(3, apePersona);
            callStat.setString(4, docPersona);
            callStat.setString(5, fecNacimiento);
            callStat.setString(6, telPersona);
            callStat.setString(7, corPersona);
            callStat.setString(8, tarProfesion);
            callStat.setString(9, estado);
            callStat.executeUpdate();

            operacion = true;
            this.cerrrarConexion();
        } catch (SQLException e) {
            System.out.println("Error" + e.toString());
        }
        return operacion;
    }
    
    public ArrayList<PersonaVO> listarPersonas(){
    
        conexion conn = new conexion();
        ArrayList<PersonaVO> listaDatos = new ArrayList<>();
        
        try {
            
            callStat = conn.obtenerConection().prepareCall("call listarPersonas");
            mensajero = callStat.executeQuery();
            
            while (mensajero.next()) {
                
                idpersona = mensajero.getString("idpersona");
                nomPersona = mensajero.getString("nomPersona");
                apePersona = mensajero.getString("apePersona");
                docPersona = mensajero.getString("cedPersona");
                fecNacimiento = mensajero.getString("fecNacimiento");
                telPersona = mensajero.getString("telPersona");
                corPersona = mensajero.getString("corPersona");
                tarProfesion = mensajero.getString("tarProfecion");
                estado = mensajero.getString("estado");
                
                PersonaVO personaVO = new PersonaVO();
                
                personaVO.setIdpersona(idpersona);
                personaVO.setNomPersona(nomPersona);
                personaVO.setApePersona(apePersona);
                personaVO.setDocPersona(docPersona);
                personaVO.setFecNacimiento(fecNacimiento);
                personaVO.setTelPersona(telPersona);
                personaVO.setCorPersona(corPersona);
                personaVO.setTarProfesion(tarProfesion);
                personaVO.setEstado(estado);
                
                listaDatos.add(personaVO);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println("Error" + e.toString());
            
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

}
