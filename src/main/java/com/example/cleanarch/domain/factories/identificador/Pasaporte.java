package com.example.cleanarch.domain.factories.identificador;

import com.example.cleanarch.domain.models.enums.TipoIdentificador;

public class Pasaporte extends Identificador {
    public Pasaporte(String valor) {
        super(valor);
        if (!TipoIdentificador.PASAPORTE.esValido(valor)) {
            throw new IllegalArgumentException("Pasaporte inválido: " + valor);
        }
    }
}
