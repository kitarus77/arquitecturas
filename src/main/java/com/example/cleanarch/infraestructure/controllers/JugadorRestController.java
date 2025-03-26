package com.example.cleanarch.infraestructure.controllers;

import com.example.cleanarch.application.usecases.CrearJugadorUseCase;
import com.example.cleanarch.domain.models.Jugador;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Objects;

@RestController
@RequestMapping("/jugadores")
@RequiredArgsConstructor
public class JugadorRestController {

    private final CrearJugadorUseCase crearJugadorUseCase;

    @GetMapping("/status")
    public ResponseEntity<String> getStatus() {
        return ResponseEntity.ok().body("Clean-Architecture Microservice is up!");
    }

    @PostMapping("/crear")
    public ResponseEntity<String> crearJugador(@Valid final Jugador jugador) {

        if(Objects.isNull(jugador)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No se puede crear un Jugador vacío");
        }

        String idJugadorCreado = crearJugadorUseCase.execute(jugador);

        return ResponseEntity.status(HttpStatus.OK).body(String.format("Jugador con id: <%s> creado con éxito", idJugadorCreado));
    }

}
