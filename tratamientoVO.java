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
public class tratamientoVO {
    public int idTratamiento  ;
    public String nomTratamiento ;
    public String desTratamiento  ;
    public int valTratamiento  ;
    public String estado ;

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getNomTratamiento() {
        return nomTratamiento;
    }

    public void setNomTratamiento(String nomTratamiento) {
        this.nomTratamiento = nomTratamiento;
    }

    public String getDesTratamiento() {
        return desTratamiento;
    }

    public void setDesTratamiento(String desTratamiento) {
        this.desTratamiento = desTratamiento;
    }

    public int getValTratamiento() {
        return valTratamiento;
    }

    public void setValTratamiento(int valTratamiento) {
        this.valTratamiento = valTratamiento;
    }

  
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public tratamientoVO(int idTratamiento, String nomTratamiento, String desTratamiento, int valTratamiento, String estado) {
        this.idTratamiento = idTratamiento;
        this.nomTratamiento = nomTratamiento;
        this.desTratamiento = desTratamiento;
        this.valTratamiento = valTratamiento;
        this.estado = estado;
    }

    public tratamientoVO() {
    }
}
