package com.kitarsoft.example.domain.valueobjects;

import java.util.Objects;
import java.util.UUID;

public final class ProductoId {

    private final UUID value;

    public ProductoId(UUID value) {
        this.value = Objects.requireNonNull(value, "value must not be null");
    }

    public static ProductoId nuevo() {
        return new ProductoId(UUID.randomUUID());
    }

    public UUID getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductoId productoId)) return false;
        return value.equals(productoId.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
