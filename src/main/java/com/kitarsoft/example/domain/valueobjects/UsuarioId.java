package com.kitarsoft.example.domain.valueobjects;

import java.util.Objects;
import java.util.UUID;

public final class UsuarioId {

    private final UUID value;

    public UsuarioId(UUID value) {
        this.value = Objects.requireNonNull(value, "value must not be null");
    }

    public static UsuarioId nuevo() {
        return new UsuarioId(UUID.randomUUID());
    }

    public UUID getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioId usuarioId)) return false;
        return value.equals(usuarioId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
