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
import modeloVO.citasVO;
import util.conexion;
import util.interfaz;

/**
 *
 * @author nicolas silva
 */
public class citaDAO extends conexion implements interfaz {
private Connection conexionBD = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    CallableStatement callsta;
    public int idCita =0;
     public String fecCita ="" ;
     public int idTratamiento =0 ;
     public String Estado ="";
     private boolean operacion = false;
     
     public citaDAO (citasVO citvo){
         super ();
         try {
             conexionBD = this.obtenerConection();
             puente =conexionBD.createStatement();
             idCita=citvo.getIdCita();
             fecCita=citvo.getFecCita();
             idTratamiento=citvo.getIdTratamiento();
             Estado=citvo.getEstado();
         } catch (Exception e) {
               System.out.println("¡ERROR!"+e.toString());
         }
     }
    @Override
    public boolean AgregarRegistro() {
        try {
            callsta=conexionBD.prepareCall("call registrocita(?,?,?)");
            callsta.setString(1, fecCita);
            callsta.setInt(2, idTratamiento);
            callsta.setString(3, Estado);
            callsta.executeUpdate();
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
            callsta=conexionBD.prepareCall("CALL  actualozarcita(?,?,?) ");
           callsta.setString(1, fecCita);
            callsta.setInt(2, idTratamiento);
            callsta.setString(3, Estado);
            callsta.executeUpdate();
            operacion = true;
            this.cerrrarConexion();
        } catch (Exception e) {
             System.out.println("Error" + e.toString());
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
