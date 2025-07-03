package com.perfulandia.authgestion.dto;

public class VendedorDTO {

    private Integer idVendedor;
    private Integer idUsuario;
    private String nombreCompleto;
    private String rut;
    private String areaVentas;

    //constructor sin parámetros
    public VendedorDTO() {
    }

    //constructor con parámetros
    public VendedorDTO(Integer idVendedor, Integer idUsuario, String nombreCompleto, String rut, String areaVentas) {
        this.idVendedor = idVendedor;
        this.idUsuario = idUsuario;
        this.nombreCompleto = nombreCompleto;
        this.rut = rut;
        this.areaVentas = areaVentas;
    }

    //getters y setters
    public Integer getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
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

    public String getAreaVentas() {
        return areaVentas;
    }

    public void setAreaVentas(String areaVentas) {
        this.areaVentas = areaVentas;
    }
}
