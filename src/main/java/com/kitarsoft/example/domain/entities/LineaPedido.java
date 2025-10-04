package com.kitarsoft.example.domain.entities;

import com.kitarsoft.example.domain.valueobjects.Dinero;
import com.kitarsoft.example.domain.valueobjects.ProductoId;

public class LineaPedido {

    private final ProductoId producto; // VO referencia a otra entidad
    private final int cantidad;
    private final Dinero precio; // VO

    public LineaPedido(ProductoId producto, int cantidad, Dinero precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Dinero subtotal() {
        return precio.multiplicar(cantidad);
    }

}
