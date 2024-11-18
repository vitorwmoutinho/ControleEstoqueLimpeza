package com.moutinhodev.estoque.repository;

import com.moutinhodev.estoque.model.Retirada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RetiradaRepository extends JpaRepository<Retirada, Long> {
}
