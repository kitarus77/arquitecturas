package com.kitarsoft.example.domain.valueobjects;

import java.util.Objects;

public final class Direccion {

    private final String calle;
    private final String numero;
    private final String piso;
    private final String puerta;
    private final String codigoPostal;
    private final String ciudad;
    private final String provincia;
    private final String pais;

    public Direccion(String calle, String numero, String piso, String puerta, String codigoPostal, String ciudad, String provincia, String pais) {
        this.calle = Objects.requireNonNull(calle, "calle must not be null");
        this.numero = Objects.requireNonNull(numero, "numero must not be null");
        this.piso = piso;
        this.puerta = puerta;
        this.codigoPostal = Objects.requireNonNull(codigoPostal, "codigoPostal must not be null");
        this.ciudad = Objects.requireNonNull(ciudad, "ciudad must not be null");
        this.provincia = Objects.requireNonNull(provincia, "provincia must not be null");;
        this.pais = Objects.requireNonNull(pais, "pais must not be null");;
    }

    // Getters
    public String getCalle() {
        return calle;
    }
    public String getNumero() {
        return numero;
    }
    public String getPiso() {
        return piso;
    }
    public String getPuerta() {
        return puerta;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }
    public String getCiudad() {
        return ciudad;
    }
    public String getProvincia() {
        return provincia;
    }
    public String getPais() {
        return pais;
    }

    // equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Direccion direccion)) return false;
        return calle.equals(direccion.calle) &&
                numero.equals(direccion.numero) &&
                Objects.equals(piso, direccion.piso) &&
                Objects.equals(puerta, direccion.puerta) &&
                codigoPostal.equals(direccion.codigoPostal) &&
                ciudad.equals(direccion.ciudad) &&
                provincia.equals(direccion.provincia) &&
                pais.equals(direccion.pais);
    }
    @Override
    public int hashCode() {
        return Objects.hash(calle, numero, piso, puerta, codigoPostal, ciudad, provincia, pais);
    }

}
