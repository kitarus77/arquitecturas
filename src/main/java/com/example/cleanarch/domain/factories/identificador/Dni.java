package com.example.cleanarch.domain.factories.identificador;

import com.example.cleanarch.domain.models.enums.TipoIdentificador;

public class Dni extends Identificador {
    public Dni(String valor) {
        super(valor);
        if (!TipoIdentificador.DNI.esValido(valor)) {
            throw new IllegalArgumentException("DNI inválido: " + valor);
        }
    }
}
