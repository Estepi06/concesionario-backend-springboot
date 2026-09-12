package com.Cesde.concesionario.Modelo;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "vehiculofactura")

public class MVehiculoFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer consecutivo;
    @Column(nullable = false)
    private String codfactura;
    @Column(length = 6, nullable = false)
    private String placa;
    @Column(nullable = false)
    private Integer valventa;

    //Relacion entre tablas vehiculo y vehiculofactura
//    @ManyToOne
//    @JoinColumn (name = "pkvehiculo",referencedColumnName = "placa")
//    @JsonBackReference
//    private MVehiculo vehiculo;

    //relaciones entre tablas factura y vehiculofactura
//    @ManyToOne
//    @JoinColumn(name = "pkdetalle",referencedColumnName = "codfactura")
//    private MFactura facturas;


    //Constructor
    public MVehiculoFactura(Integer consecutivo, String codfactura, String placa, Integer valventa) {
        this.consecutivo = consecutivo;
        this.codfactura = codfactura;
        this.placa = placa;
        this.valventa = valventa;
    }
    public MVehiculoFactura() {
    }

    // Encapsulamiento

    public Integer getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getCodfactura() {
        return codfactura;
    }

    public void setCodfactura(String codfactura) {
        this.codfactura = codfactura;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getValventa() {
        return valventa;
    }

    public void setValventa(Integer valventa) {
        this.valventa = valventa;
    }
}
