package com.kitarsoft.example.infraestructure.out.persistence.repositories;

import com.kitarsoft.example.infraestructure.out.persistence.entities.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoJpaRepository extends JpaRepository<PedidoEntity, Long> {
}
