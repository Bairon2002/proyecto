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
public class PersonaVO {

    public PersonaVO(String idpersona, String nomPersona, String apePersona, String docPersona, String fecNacimiento, String telPersona, String corPersona, String tarProfesion ,String estado) {
        this.idpersona = idpersona;
        this.nomPersona = nomPersona;
        this.apePersona = apePersona;
        this.docPersona=docPersona;
        this.fecNacimiento = fecNacimiento;
        this.telPersona = telPersona;
        this.corPersona = corPersona;
        this.tarProfesion = tarProfesion;
        this.estado=estado;
    }

    public PersonaVO() {
    }
    
    

    public String getDocPersona() {
        return docPersona;
    }

    public void setDocPersona(String docPersona) {
        this.docPersona = docPersona;
    }

    public String getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(String idpersona) {
        this.idpersona = idpersona;
    }

    public String getNomPersona() {
        return nomPersona;
    }

    public void setNomPersona(String nomPersona) {
        this.nomPersona = nomPersona;
    }

    public String getApePersona() {
        return apePersona;
    }

    public void setApePersona(String apePerdsona) {
        this.apePersona = apePerdsona;
    }

    public String getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(String fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    public String getTelPersona() {
        return telPersona;
    }

    public void setTelPersona(String telPersona) {
        this.telPersona = telPersona;
    }

    public String getCorPersona() {
        return corPersona;
    }

    public void setCorPersona(String corPersona) {
        this.corPersona = corPersona;
    }

    public String getTarProfesion() {
        return tarProfesion;
    }

    public void setTarProfesion(String tarProfesion) {
        this.tarProfesion = tarProfesion;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    private String idpersona;
    private String nomPersona;
    private String apePersona;
    private String docPersona;
    private String fecNacimiento;
    private String telPersona;
    private String corPersona;
    private String tarProfesion;
    private String estado;
}
