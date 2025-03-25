package com.example.cleanarch.domain.factories.identificador;

import com.example.cleanarch.domain.models.enums.TipoIdentificador;

import static com.example.cleanarch.domain.models.enums.TipoIdentificador.DNI;

public class IdentificadorFactory {
    public static Identificador crear(String valor) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El identificador no puede estar vacío");
        }

        if (DNI.esValido(valor)) {
            return new Dni(valor);
        } else if (TipoIdentificador.NIE.esValido(valor)) {
            return new Nie(valor);
        } else if (TipoIdentificador.PASAPORTE.esValido(valor)) {
            return new Pasaporte(valor);
        } else {
            throw new IllegalArgumentException("Formato de identificador desconocido: " + valor);
        }
    }
}
