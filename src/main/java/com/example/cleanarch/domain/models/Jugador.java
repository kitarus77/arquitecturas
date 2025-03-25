package com.example.cleanarch.domain.models;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.List;

@Data
public class Jugador {

    @NotNull(message = "El identificador no puede ser nulo")
    @NotBlank(message = "El identificador no puede estar vacío o contener solo espacios")
    private String identificador;

    @NotBlank(message = "El nombre no puede estar vacío o contener solo espacios")
    private String nombre;

    @NotEmpty(message = "Los apellidos no pueden estar vacíos")
    private List<String> apellidos;

    @DecimalMin(value = "0.0", inclusive = false, message = "El nivel del Jugador debe ser superior a 0.0")
    @DecimalMax(value = "6.0", message = "El nivel máximo del Jugador es 6.0")
    private float nivel;

    private boolean reves;

    private boolean derecha;

    private Integer puntos;


}
