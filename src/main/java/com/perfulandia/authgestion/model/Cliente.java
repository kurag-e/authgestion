package com.perfulandia.authgestion.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    private String nombreCompleto;
    private String rut;
    private String direccion;
    private String telefono;

    //constructor sin parámetros
    public Cliente() {
    }

    //constructor con parámetros
    public Cliente(Integer idCliente, Usuario usuario, String nombreCompleto, String rut, String direccion, String telefono) {
        this.idCliente = idCliente;
        this.usuario = usuario;
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
