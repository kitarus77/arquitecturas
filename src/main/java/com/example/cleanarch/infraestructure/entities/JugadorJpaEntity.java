package com.example.cleanarch.infraestructure.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class JugadorJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;


    private String identificador;
    private String nombre;
    private List<String> apellidos;
    private float nivel;
    private boolean reves;
    private boolean derecha;
    private Integer puntos;

}
