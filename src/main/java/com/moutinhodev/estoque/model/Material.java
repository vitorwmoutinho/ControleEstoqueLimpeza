package com.moutinhodev.estoque.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int quantidade;
    private String unidadeMedida;
}
