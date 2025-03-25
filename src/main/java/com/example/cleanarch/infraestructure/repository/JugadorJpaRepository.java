package com.example.cleanarch.infraestructure.repository;

import com.example.cleanarch.infraestructure.entities.JugadorJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorJpaRepository extends JpaRepository<JugadorJpaEntity, Long> {
}
