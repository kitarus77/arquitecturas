package com.example.cleanarch.application.usecases;

import com.example.cleanarch.domain.repository.JugadorRepository;
import com.example.cleanarch.domain.models.Jugador;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrearJugadorUseCase {

    private final JugadorRepository jugadorRepository;

    public String execute(Jugador nuevoJugador) {
        return jugadorRepository.crear(nuevoJugador);
    }
}
