package com.perfulandia.authgestion.dto;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@Relation(collectionRelation = "usuarios")
public class UsuarioDTO extends RepresentationModel<UsuarioDTO> {

    private Integer idUsuario;
    private String nombreUsuario;
    private String email;
    private String rol;
    private String estado;

    //constructor sin parámetros
    public UsuarioDTO() {
    }

    //constructor con parámetros
    public UsuarioDTO(Integer idUsuario, String nombreUsuario, String email, String rol, String estado) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.rol = rol;
        this.estado = estado;
    }

    //getters y setters
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //método adicional para obtener el id
    public Integer getId() {
        return this.idUsuario;
    }
}
