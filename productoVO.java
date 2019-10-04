/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloVO;

/**
 *
 * @author chebi
 */
public class productoVO {

    public productoVO() {
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getValProducto() {
        return valProducto;
    }

    public void setValProducto(String valProducto) {
        this.valProducto = valProducto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public productoVO(int idproducto, String nomProducto, String tipoProducto, String valProducto, String estado) {
        this.idproducto = idproducto;
        this.nomProducto = nomProducto;
        this.tipoProducto = tipoProducto;
        this.valProducto = valProducto;
        this.estado = estado;
    }
  
    private int idproducto;
    private String nomProducto;
    private String tipoProducto;
    private String valProducto;   
    private String estado;
}
