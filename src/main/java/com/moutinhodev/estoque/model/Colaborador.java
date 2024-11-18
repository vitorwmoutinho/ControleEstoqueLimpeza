package com.moutinhodev.estoque.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String setor;

}
