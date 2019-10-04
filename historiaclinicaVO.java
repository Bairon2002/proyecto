/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloVO;

/**
 *
 * @author nicolas silva
 */
public class historiaclinicaVO {
    public int idHiscli ;
    public String fecHiscli ;
    public int idpersona ;
    public int idCita ;
    public String estado ;

    public int getIdHiscli() {
        return idHiscli;
    }

    public void setIdHiscli(int idHiscli) {
        this.idHiscli = idHiscli;
    }

    public String getFecHiscli() {
        return fecHiscli;
    }

    public void setFecHiscli(String fecHiscli) {
        this.fecHiscli = fecHiscli;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public historiaclinicaVO(int idHiscli, String fecHiscli, int idpersona, int idCita, String estado) {
        this.idHiscli = idHiscli;
        this.fecHiscli = fecHiscli;
        this.idpersona = idpersona;
        this.idCita = idCita;
        this.estado = estado;
    }

    public historiaclinicaVO() {
    }
}
