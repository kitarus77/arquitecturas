package com.kitarsoft.example.domain.valueobjects;

import java.util.Objects;
import java.util.UUID;

public final class PedidoId {

    private final UUID value;

    public PedidoId(UUID value) {
        this.value = Objects.requireNonNull(value, "value must not be null");
    }

    // Método para crear el nuevo VO
    public static PedidoId nuevo() {
        return new PedidoId(UUID.randomUUID());
    }

    // Ponemos el Getter para poder acceder a este valor desde fuera
    public UUID getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PedidoId pedidoId)) return false;
        return value.equals(pedidoId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }


}
