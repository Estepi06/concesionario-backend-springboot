package com.Cesde.concesionario.Modelo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "vehiculo")

public class MVehiculo {
    //atributos

    @Id
    @Column(length = 6, nullable = false)
    private String placa;
    @Column(length = 15, nullable = false)
    private String marca;
    @Column(length = 4, nullable = false)
    private String modelo;
    @Column(nullable = false)
    private Integer valor;
    @Column(nullable = false)
    private Boolean estado;


    //relaciones entre tablas
    //@OneToMany(mappedBy = "vehiculo")
    //@JsonManagedReference
    //private List<MVehiculoFactura> facturas;

    //Contructor

    public MVehiculo(String placa, String marca, String modelo, Integer valor, Boolean estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
        this.estado = estado;
    }

    public MVehiculo() {
    }

    //encapsulamiento

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}

