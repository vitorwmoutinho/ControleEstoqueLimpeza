package com.moutinhodev.estoque.repository;

import com.moutinhodev.estoque.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MaterialRepository extends JpaRepository<Material, Long> {

}
