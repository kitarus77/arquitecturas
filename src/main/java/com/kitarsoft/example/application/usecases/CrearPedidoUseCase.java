package com.kitarsoft.example.application.usecases;

import com.kitarsoft.example.domain.aggregates.Pedido;
import com.kitarsoft.example.domain.ports.out.PedidoRepository;
import com.kitarsoft.example.domain.valueobjects.Direccion;
import com.kitarsoft.example.domain.valueobjects.PedidoId;
import com.kitarsoft.example.domain.valueobjects.UsuarioId;
import org.springframework.stereotype.Service;

@Service
public class CrearPedidoUseCase {

    private final PedidoRepository pedidoRepository;

    public CrearPedidoUseCase(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public void ejecutar(UsuarioId cliente, Direccion envio) {
        PedidoId id = PedidoId.nuevo();
        Pedido nuevoPedido = new Pedido(id, cliente, envio);
        this.pedidoRepository.save(nuevoPedido);
    }

}
