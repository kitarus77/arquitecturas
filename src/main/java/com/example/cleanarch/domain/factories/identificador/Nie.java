package com.example.cleanarch.domain.factories.identificador;

import com.example.cleanarch.domain.models.enums.TipoIdentificador;

public class Nie extends Identificador {
    public Nie(String valor) {
        super(valor);
        if (!TipoIdentificador.NIE.esValido(valor)) {
            throw new IllegalArgumentException("NIE inválido: " + valor);
        }
    }
}
