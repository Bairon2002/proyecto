/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloVO;

/**
 *
 * @author nicolas silva
 * try (cita.validar(){
 * if(pedidocita.registra(){
 * }
 * else {
 *elimine el regitro anterior de la tabla detalle
 * }
 */
public class pedidocitaVO {
    public int Idprdidocita ;
    public String Fecpedidocita ;
    public String estado ;

    public int getIdprdidocita() {
        return Idprdidocita;
    }

    public void setIdprdidocita(int Idprdidocita) {
        this.Idprdidocita = Idprdidocita;
    }

    public String getFecpedidocita() {
        return Fecpedidocita;
    }

    public void setFecpedidocita(String Fecpedidocita) {
        this.Fecpedidocita = Fecpedidocita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public pedidocitaVO(int Idprdidocita, String Fecpedidocita, String estado) {
        this.Idprdidocita = Idprdidocita;
        this.Fecpedidocita = Fecpedidocita;
        this.estado = estado;
    }

    public pedidocitaVO() {
    }
}
