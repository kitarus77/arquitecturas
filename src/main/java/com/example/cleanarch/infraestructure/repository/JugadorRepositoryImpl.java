package com.example.cleanarch.infraestructure.repository;

import com.example.cleanarch.domain.factories.identificador.Identificador;
import com.example.cleanarch.domain.models.Jugador;
import com.example.cleanarch.domain.repository.JugadorRepository;
import com.example.cleanarch.infraestructure.entities.JugadorJpaEntity;
import com.example.cleanarch.infraestructure.mappers.JugadorJpaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class JugadorRepositoryImpl implements JugadorRepository {

    private final JugadorJpaRepository jugadorJpaRepository;
    private final JugadorJpaMapper jugadorMapper;

    @Override
    public String crear(Jugador nuevoJugador) {
        JugadorJpaEntity jugadorJpaEntity = jugadorMapper.jugadorToJugadorJpa(nuevoJugador);
        JugadorJpaEntity jugadorCreado = this.jugadorJpaRepository.save(jugadorJpaEntity);
        return jugadorCreado.getIdentificador();
    }

    @Override
    public Jugador obtener(Identificador identificador) {
        return null;
    }

    @Override
    public String editar(Jugador nuevoJugador) {
        return null;
    }

    @Override
    public String eliminar(Jugador nuevoJugador) {
        return null;
    }
}
