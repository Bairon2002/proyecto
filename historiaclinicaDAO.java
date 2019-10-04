/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeoDAO;


import modeloVO.historiaclinicaVO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import util.conexion;
import util.interfaz;

/**
 *
 * @author nicolas silva
 */
public class historiaclinicaDAO extends conexion implements interfaz{
private Connection conexionBD = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    CallableStatement callsta;
    public int idHiscli =0;
    public String fecHiscli="" ;
    public int idpersona=0 ;
    public int idCita =0;
    public String estado ="";
    private boolean operacion = false;
   public historiaclinicaDAO(){
        
    }
   public historiaclinicaDAO(historiaclinicaVO hisvo){
     super();
        try {
             conexionBD = this.obtenerConection();
             puente =conexionBD.createStatement();
             idHiscli=hisvo.getIdCita();
             fecHiscli=hisvo.getFecHiscli();
             idpersona=hisvo.getIdpersona();
             idCita=hisvo.getIdCita();
             estado=hisvo.getEstado();
        } catch (Exception e) {
             System.out.println("¡ERROR!"+e.toString());
        }
    }
    @Override
    public boolean AgregarRegistro() {
        try {
             callsta=conexionBD.prepareCall("call registrohistoriaclinica(?,?,?,?)");
             callsta.setString(1,fecHiscli);
             callsta.setInt(2,idpersona);
             callsta.setInt(3,idCita);
             callsta.setString(4,estado);
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
