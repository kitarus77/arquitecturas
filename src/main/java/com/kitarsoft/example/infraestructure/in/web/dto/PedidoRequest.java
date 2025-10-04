package com.kitarsoft.example.infraestructure.in.web.dto;

import java.util.UUID;

public record PedidoRequest(
        UUID clienteId,
        String calle,
        String numero,
        String piso,
        String puerta,
        String codigoPostal,
        String ciudad,
        String provincia,
        String pais) {
}
