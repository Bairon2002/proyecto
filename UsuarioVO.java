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
public class UsuarioVO {

    public UsuarioVO( String nomUsuario, String pasUsuario, String idRol, String Idpersona, String estado) {
        
        this.nomUsuario = nomUsuario;
        this.pasUsuario = pasUsuario;
        this.idRol=idRol;
        this.Idpersona = Idpersona;
        this.estado=estado;
    }

    

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getPasUsuario() {
        return pasUsuario;
    }

    public void setPasUsuario(String pasUsuario) {
        this.pasUsuario = pasUsuario;
    }

  
    public String getIdpersona() {
        return Idpersona;
    }

    public void setIdpersona(String Idpersona) {
        this.Idpersona = Idpersona;
    }
    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    private String nomUsuario;
    private String pasUsuario;
    private String idRol;
    private String Idpersona;
    private String  estado;
}
