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
public class citasVO {
    public int idCita ;
    public String fecCita  ;
    public int idTratamiento ;
    public String estado ;

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getFecCita() {
        return fecCita;
    }

    public void setFecCita(String fecCita) {
        this.fecCita = fecCita;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public citasVO(int idCita, String fecCita, int idTratamiento, String estado) {
        this.idCita = idCita;
        this.fecCita = fecCita;
        this.idTratamiento = idTratamiento;
        this.estado = estado;
    }

    public citasVO() {
    }
}
