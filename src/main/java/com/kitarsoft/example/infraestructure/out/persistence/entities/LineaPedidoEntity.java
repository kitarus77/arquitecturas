package com.kitarsoft.example.infraestructure.out.persistence.entities;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "lineas_pedido")
public class LineaPedidoEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private UUID productoId;

    @Column(nullable = false)
    private int cantidad;

    @Column(nullable = false)
    private int precio; // en céntimos

    @Column(nullable = false)
    private String moneda;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getProductoId() {
        return productoId;
    }

    public void setProductoId(UUID productoId) {
        this.productoId = productoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
}
