package com.kitarsoft.example.infraestructure.out.persistence.entities;

import com.kitarsoft.example.domain.EstadoPedido;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "pedidos")
public class PedidoEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private UUID clienteId;

    @Embedded
    private DireccionEmbeddable envio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "pedido_id")
    private List<LineaPedidoEntity> lineas;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoPedido estado;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getClienteId() {
        return clienteId;
    }

    public void setClienteId(UUID clienteId) {
        this.clienteId = clienteId;
    }

    public DireccionEmbeddable getEnvio() {
        return envio;
    }

    public void setEnvio(DireccionEmbeddable envio) {
        this.envio = envio;
    }

    public List<LineaPedidoEntity> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaPedidoEntity> lineas) {
        this.lineas = lineas;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
}
