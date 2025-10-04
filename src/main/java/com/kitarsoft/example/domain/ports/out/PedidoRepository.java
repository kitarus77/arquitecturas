package com.kitarsoft.example.domain.ports.out;

import com.kitarsoft.example.domain.aggregates.Pedido;

public interface PedidoRepository {

    void save(Pedido pedido);
    // otros métodos CRUD
}
