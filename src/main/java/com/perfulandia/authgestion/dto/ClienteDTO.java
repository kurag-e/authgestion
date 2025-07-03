package com.perfulandia.authgestion.dto;

public class ClienteDTO {
    private Integer idCliente;
    private Integer idUsuario;
    private String nombreCompleto;
    private String rut;
    private String direccion;
    private String telefono;

    //constructor sin parámetros
    public ClienteDTO() {
    }

    //constructor con parámetros
    public ClienteDTO(Integer idCliente, Integer idUsuario, String nombreCompleto, String rut, String direccion, String telefono) {
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
        this.nombreCompleto = nombreCompleto;
        this.rut = rut;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //getters y setters
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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
}
