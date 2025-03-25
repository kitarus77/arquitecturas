package com.example.cleanarch.domain.factories.identificador;

public abstract class Identificador {
    protected final String valor;

    protected Identificador(String valor) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El identificador no puede estar vacío");
        }
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Identificador that = (Identificador) obj;
        return valor.equals(that.valor);
    }

    @Override
    public int hashCode() {
        return valor.hashCode();
    }
}

