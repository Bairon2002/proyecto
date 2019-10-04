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
import modeloVO.MedicamentoVO;
import util.conexion;
import util.interfaz;

/**
 *
 * @author APRENDIZ
 */
public class MedicamentoDAO extends conexion implements interfaz {

    //Conexion
    private Connection conexion = null;
    private Statement puente = null;
    private ResultSet mensajero = null;
    CallableStatement callStat;

    //Variables que se van a usar
    private String idMedicamento = "";
    private String nomMedicamento = "";
    private String tipMedicamento = "";
    private String conMedicamento = "";
    private String valMedicamento = "";
    private String StoMedicamento = "";
    private String labMedicamento = "";
    private String estado = "";

    private boolean operacion = false;

    public MedicamentoDAO() {
    }

    public MedicamentoDAO(MedicamentoVO medVO) {
        super();
        try {
            conexion = this.obtenerConection();
            puente = conexion.createStatement();

            idMedicamento = medVO.getIdMedicamento();
            nomMedicamento = medVO.getNomMedicamento();
            tipMedicamento = medVO.getTipMedicamento();
            conMedicamento = medVO.getConMedicamento();
            valMedicamento = medVO.getValMedicamento();
            StoMedicamento = medVO.getStoMedicamento();
            labMedicamento = medVO.getLabMedicamento();
            estado = medVO.getEstado();
        } catch (Exception e) {
            System.out.println("Error!" + e.toString());
        }
    }

    @Override
    public boolean AgregarRegistro() {
        try {
            callStat = conexionBD.prepareCall("call registroMedicamento(?,?,?,?,?,?,?)");
            callStat.setString(1, nomMedicamento);
            callStat.setString(2, tipMedicamento);
            callStat.setString(3, conMedicamento);
            callStat.setString(4, valMedicamento);
            callStat.setString(5, StoMedicamento);
            callStat.setString(6, labMedicamento);
            callStat.setString(7, estado);
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
            callStat = conexionBD.prepareCall("call actualizarMedicamento((?,?,?,?,?,?,?)");
            callStat.setString(1, nomMedicamento);
            callStat.setString(2, tipMedicamento);
            callStat.setString(3, conMedicamento);
            callStat.setString(4, valMedicamento);
            callStat.setString(5, StoMedicamento);
            callStat.setString(6, labMedicamento);
            callStat.setString(7, estado);
            callStat.executeUpdate();

            operacion = true;
            this.cerrrarConexion();
        } catch (SQLException e) {
            System.out.println("Error" + e.toString());
        }
        return operacion;
    }

    public ArrayList<MedicamentoVO> listarMedicamento() {
        
        conexion conn = new conexion();
        ArrayList<MedicamentoVO> listaDatos = new ArrayList<>();
        
        try {
            callStat = conn.obtenerConection().prepareCall("call listarMedicamento");
            mensajero = callStat.executeQuery();

            while (mensajero.next()) {
                idMedicamento = mensajero.getString("idMedicamento");
                nomMedicamento = mensajero.getString("nomMedicamento");
                tipMedicamento = mensajero.getString("tipMedicamento");
                conMedicamento = mensajero.getString("conMedicamento");
                valMedicamento = mensajero.getString("valMedicamento");
                StoMedicamento = mensajero.getString("StoMedicamento");
                labMedicamento = mensajero.getString("labMedicamento");
                estado = mensajero.getString("estado");

                MedicamentoVO medicamentoVO = new MedicamentoVO();

                medicamentoVO.setIdMedicamento(idMedicamento);
                medicamentoVO.setNomMedicamento(nomMedicamento);
                medicamentoVO.setTipMedicamento(tipMedicamento);
                medicamentoVO.setConMedicamento(conMedicamento);
                medicamentoVO.setValMedicamento(valMedicamento);
                medicamentoVO.setStoMedicamento(StoMedicamento);
                medicamentoVO.setLabMedicamento(labMedicamento);
                medicamentoVO.setEstado(estado);

                listaDatos.add(medicamentoVO);

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
