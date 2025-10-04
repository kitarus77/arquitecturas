package com.kitarsoft.example.domain.valueobjects;

public final class Dinero {

    private final int cantidad; // en centimos
    private final String moneda; // EUR, USD, etc.

    public Dinero(int cantidad, String moneda) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        if (moneda == null || moneda.isEmpty()) {
            throw new IllegalArgumentException("La moneda no puede ser nula o vacía");
        }
        this.cantidad = cantidad;
        this.moneda = moneda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getMoneda() {
        return moneda;
    }

    public Dinero sumar(Dinero otro) {
        if (!this.moneda.equals(otro.moneda)) {
            throw new IllegalArgumentException("No se pueden sumar cantidades en diferentes monedas");
        }
        return new Dinero(this.cantidad + otro.cantidad, this.moneda);
    }

    public Dinero restar(Dinero otro) {
        if (!this.moneda.equals(otro.moneda)) {
            throw new IllegalArgumentException("No se pueden restar cantidades en diferentes monedas");
        }
        int nuevaCantidad = this.cantidad - otro.cantidad;
        if (nuevaCantidad < 0) {
            throw new IllegalArgumentException("El resultado de la resta no puede ser negativo");
        }
        return new Dinero(nuevaCantidad, this.moneda);
    }

    public Dinero multiplicar(int factor) {
        if (factor < 0) {
            throw new IllegalArgumentException("El factor de multiplicación no puede ser negativo");
        }
        return new Dinero(this.cantidad * factor, this.moneda);
    }

    // Moneda y valor cero por defecto
    public static Dinero cero() {
        return new Dinero(0, "EUR");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dinero dinero)) return false;
        return cantidad == dinero.cantidad && moneda.equals(dinero.moneda);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(cantidad);
        result = 31 * result + moneda.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return String.format("%d %s", cantidad / 100, moneda);
    }
}
