package com.perfulandia.authgestion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CrearUsuarioRequest {

    private String nombreUsuario;
    private String email;
    @JsonProperty("contrasena")
    private String contrasena;
    private String rol;
    private String estado;
    private String nombreCompleto;
    private String rut;
    private String direccion;
    private String telefono;
    private String areaVentas;

    //constructor sin parámetros
    public CrearUsuarioRequest() {
    }

    //constructor con parámetros
    public CrearUsuarioRequest(String nombreUsuario, String email, String contrasena, String rol, String estado,
                               String nombreCompleto, String rut, String direccion, String telefono, String areaVentas) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.contrasena = contrasena;
        this.rol = rol;
        this.estado = estado;
        this.nombreCompleto = nombreCompleto;
        this.rut = rut;
        this.direccion = direccion;
        this.telefono = telefono;
        this.areaVentas = areaVentas;
    }

    //getters y setters
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAreaVentas() {
        return areaVentas;
    }

    public void setAreaVentas(String areaVentas) {
        this.areaVentas = areaVentas;
    }
}
