package com.kitarsoft.example.infraestructure.out.persistence.adapters;

import com.kitarsoft.example.domain.aggregates.Pedido;
import com.kitarsoft.example.domain.ports.out.PedidoRepository;
import com.kitarsoft.example.infraestructure.out.persistence.entities.PedidoEntity;
import com.kitarsoft.example.infraestructure.out.persistence.repositories.PedidoJpaRepository;
import org.springframework.stereotype.Component;

@Component
public class PedidoRepositoryAdapter implements PedidoRepository {

    private final PedidoJpaRepository pedidoJpaRepository;

    public PedidoRepositoryAdapter(PedidoJpaRepository pedidoJpaRepository) {
        this.pedidoJpaRepository = pedidoJpaRepository;
    }

    @Override
    public void save(Pedido pedido) {
        this.pedidoJpaRepository.save(toEntity(pedido));
    }

    private PedidoEntity toEntity(Pedido pedido) {
        PedidoEntity entity = new PedidoEntity();
        entity.setClienteId(pedido.getCliente().getValue());
        entity.setEstado(pedido.getEstado());
        // Respo de los campos...
        return entity;
    }

}
