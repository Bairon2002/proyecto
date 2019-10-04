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
public class detallecitaVO {
    public int Iddetalleprdidocita ;
    public String Fecdetallepedidocita ;
    public int Idprdidocita ;
    public int idpersona ;
    public String estado ;

    public int getIddetalleprdidocita() {
        return Iddetalleprdidocita;
    }

    public void setIddetalleprdidocita(int Iddetalleprdidocita) {
        this.Iddetalleprdidocita = Iddetalleprdidocita;
    }

    public String getFecdetallepedidocita() {
        return Fecdetallepedidocita;
    }

    public void setFecdetallepedidocita(String Fecdetallepedidocita) {
        this.Fecdetallepedidocita = Fecdetallepedidocita;
    }

    public int getIdprdidocita() {
        return Idprdidocita;
    }

    public void setIdprdidocita(int Idprdidocita) {
        this.Idprdidocita = Idprdidocita;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public detallecitaVO(int Iddetalleprdidocita, String Fecdetallepedidocita, int Idprdidocita, int idpersona, String estado) {
        this.Iddetalleprdidocita = Iddetalleprdidocita;
        this.Fecdetallepedidocita = Fecdetallepedidocita;
        this.Idprdidocita = Idprdidocita;
        this.idpersona = idpersona;
        this.estado = estado;
    }

    public detallecitaVO() {
    }
    }
