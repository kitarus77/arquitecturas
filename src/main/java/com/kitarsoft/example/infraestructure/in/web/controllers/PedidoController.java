package com.kitarsoft.example.infraestructure.in.web.controllers;

import com.kitarsoft.example.application.usecases.CrearPedidoUseCase;
import com.kitarsoft.example.domain.valueobjects.Direccion;
import com.kitarsoft.example.domain.valueobjects.UsuarioId;
import com.kitarsoft.example.infraestructure.in.web.dto.PedidoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final CrearPedidoUseCase crearPedidoUseCase;

    public PedidoController(CrearPedidoUseCase crearPedidoUseCase) {
        this.crearPedidoUseCase = crearPedidoUseCase;
    }

    @PostMapping("/crear")
    public ResponseEntity<String> crearPedido(@RequestBody PedidoRequest request) {
        UsuarioId cliente = new UsuarioId(request.clienteId());
        Direccion envio = new Direccion(
                request.calle(),
                request.numero(),
                request.piso(),
                request.puerta(),
                request.codigoPostal(),
                request.ciudad(),
                request.provincia(),
                request.pais()
        );
        this.crearPedidoUseCase.ejecutar(cliente, envio);
        return ResponseEntity.ok("Pedido creado con éxito");
    }

}
