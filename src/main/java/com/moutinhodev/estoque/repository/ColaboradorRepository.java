package com.moutinhodev.estoque.repository;

import com.moutinhodev.estoque.model.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepository extends JpaRepository<Colaborador,Long> {
}
