/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author APRENDIZ
 */
public class conexion {
    private String driver,urlBD, bd,userBD,passswordBD;
    public Connection conexionBD;
    
    public conexion () {
        driver="com.mysql.jdbc.Driver";
        bd="optica";
        userBD="root";
        passswordBD="";
        urlBD="jdbc:mysql://localhost:3306/" + bd;
        
        try {
            Class.forName(driver).newInstance();
            conexionBD = DriverManager.getConnection(urlBD, userBD, passswordBD);
            System.out.println("!La conexion a sido establecida¡");
        } catch (Exception e) {
            System.out.println("!Error en la conexion¡"+ e.toString());
        }
    }
    
    public Connection obtenerConection(){
        return conexionBD; 
    }
    
    public Connection cerrrarConexion () throws SQLException {
        conexionBD.close();
        conexionBD = null;
        return conexionBD;
    }
    
    public static void main(String[] args) {
        new conexion();
    }
}
