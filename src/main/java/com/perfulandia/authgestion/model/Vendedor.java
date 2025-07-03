package com.perfulandia.authgestion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendedores")
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vendedor")
    private Integer idVendedor;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    private String nombreCompleto;
    private String rut;
    private String areaVentas;

    //constructor sin parámetros
    public Vendedor() {
    }

    //constructor con parámetros
    public Vendedor(Integer idVendedor, Usuario usuario, String nombreCompleto, String rut, String areaVentas) {
        this.idVendedor = idVendedor;
        this.usuario = usuario;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
