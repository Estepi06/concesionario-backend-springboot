package com.Cesde.concesionario.Modelo;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "factura")

public class MFactura {
    //atributos
    @Id
    @Column(nullable = false)
    private String codfactura;
    @Column(nullable = false)
    private LocalDate fecha;
    @Column(length=15,nullable = false)
    private String idcliente;
    @Column(length=2,nullable = false)
    private Boolean activo;



    //relaciones entre tablas cliente y factura
    //@ManyToOne
    //@JoinColumn(name="pkfactura" ,referencedColumnName = "idcliente")
    //@JsonBackReference
    //private MCliente cliente;

    //relaciones entre tablas factura y vehiculofactura
    //@OneToMany(mappedBy = "facturas")
    //@JsonManagedReference
    //private List<MVehiculoFactura> vehiculoFactura;

    //Constructor

    public MFactura(String codfactura, LocalDate fecha, String idcliente, Boolean activo) {
        this.codfactura = codfactura;
        this.fecha = fecha;
        this.idcliente = idcliente;
        this.activo = activo;
    }

    public MFactura() {
    }

    //encapsulamiento
    public String getCodfactura() {
        return codfactura;
    }

    public void setCodfactura(String codfactura) {
        this.codfactura = codfactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
