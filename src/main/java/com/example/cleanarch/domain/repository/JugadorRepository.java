package com.example.cleanarch.domain.repository;

import com.example.cleanarch.domain.factories.identificador.Identificador;
import com.example.cleanarch.domain.models.Jugador;

public interface JugadorRepository {
    public String crear(Jugador nuevoJugador);
    public Jugador obtener(Identificador identificador);
    public String editar(Jugador nuevoJugador);
    public String eliminar(Jugador nuevoJugador);

}
