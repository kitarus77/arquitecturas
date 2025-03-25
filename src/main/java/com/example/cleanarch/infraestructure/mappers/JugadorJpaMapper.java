package com.example.cleanarch.infraestructure.mappers;

import com.example.cleanarch.domain.models.Jugador;
import com.example.cleanarch.infraestructure.entities.JugadorJpaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JugadorJpaMapper {

    JugadorJpaEntity jugadorToJugadorJpa(Jugador jugador);

    Jugador jugadorJpaToJugador(JugadorJpaEntity jugadorJpaEntity);
}
