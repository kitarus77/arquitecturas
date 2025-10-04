package com.kitarsoft.example.domain.aggregates;

import com.kitarsoft.example.domain.EstadoPedido;
import com.kitarsoft.example.domain.entities.LineaPedido;
import com.kitarsoft.example.domain.valueobjects.*;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final PedidoId id;  // Identidad del agregado
    private final UsuarioId cliente;    // VO referencia a otra entidad
    private final Direccion envio;  // VO
    private final List<LineaPedido> lineas = new ArrayList<>(); // Entidad interna
    private EstadoPedido estado;  // Enum, no requiere ser VO

    public Pedido(PedidoId id, UsuarioId cliente, Direccion envio) {
        this.id = id;
        this.cliente = cliente;
        this.envio = envio;
        this.estado = EstadoPedido.PENDIENTE;
    }

    public PedidoId getId() {
        return id;
    }

    public UsuarioId getCliente() {
        return cliente;
    }

    public Direccion getEnvio() {
        return envio;
    }

    public List<LineaPedido> getLineas() {
        return lineas;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    // Lógica para agregar
    public void agregarLineaPedido(ProductoId producto, int cantidad, Dinero precio) {
        if(estado != EstadoPedido.PENDIENTE) {
            throw new IllegalStateException("No se pueden añadir líneas a un pedido confirmado");
        }
        lineas.add(new LineaPedido(producto, cantidad, precio));
    }

    public Dinero calcularTotal() {
        return lineas.stream()
                     .map(LineaPedido::subtotal)
                     .reduce(Dinero.cero(), Dinero::sumar);
    }
}
