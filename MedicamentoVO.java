/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloVO;

/**
 *
 * @author APRENDIZ
 */
public class MedicamentoVO {

    public MedicamentoVO( String idMedicamento,String nomMedicamento, String tipMedicamento, String conMedicamento, String valMedicamento, String StoMedicamento, String labMedicamento, String estado) {
        
        this.idMedicamento = idMedicamento;
        this.nomMedicamento = nomMedicamento;
        this.tipMedicamento = tipMedicamento;
        this.conMedicamento = conMedicamento;
        this.valMedicamento = valMedicamento;
        this.StoMedicamento = StoMedicamento;
        this.labMedicamento = labMedicamento;
        this.estado = estado;

    }

    public MedicamentoVO() {
    }

    public String getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(String idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

   

    public String getNomMedicamento() {
        return nomMedicamento;
    }

    public void setNomMedicamento(String nomPersona) {
        this.nomMedicamento = nomPersona;
    }

    public String getTipMedicamento() {
        return tipMedicamento;
    }

    public void setTipMedicamento(String tipMedicamento) {
        this.tipMedicamento = tipMedicamento;
    }

    public String getConMedicamento() {
        return conMedicamento;
    }

    public void setConMedicamento(String conMedicamento) {
        this.conMedicamento = conMedicamento;
    }

    public String getValMedicamento() {
        return valMedicamento;
    }

    public void setValMedicamento(String valMedicamento) {
        this.valMedicamento = valMedicamento;
    }

    public String getStoMedicamento() {
        return StoMedicamento;
    }

    public void setStoMedicamento(String StoMedicamento) {
        this.StoMedicamento = StoMedicamento;
    }

    public String getLabMedicamento() {
        return labMedicamento;
    }

    public void setLabMedicamento(String labMedicamento) {
        this.labMedicamento = labMedicamento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

     
    

   private String idMedicamento;
    private String nomMedicamento;
    private String tipMedicamento;
    private String conMedicamento;
    private String valMedicamento;
    private String StoMedicamento;
    private String labMedicamento;
    private String estado;
    
}
