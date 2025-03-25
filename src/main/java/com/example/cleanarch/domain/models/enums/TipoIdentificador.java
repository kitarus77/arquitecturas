package com.example.cleanarch.domain.models.enums;

public enum TipoIdentificador {
    DNI("^[0-9]{8}[A-Z]$"),
    NIE("^[XYZ][0-9]{7}[A-Z]$"),
    PASAPORTE("^[A-Z0-9]{6,9}$");

    private final String regex;

    TipoIdentificador(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }

    public boolean esValido(String valor) {
        return valor != null && valor.matches(regex);
    }
}
