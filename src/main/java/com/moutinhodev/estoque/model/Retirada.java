package com.moutinhodev.estoque.model;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Retirada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Colaborador colaborador;

    @ManyToOne
    private Material material;

    private int quantidade;
    private LocalDate dataretirada;

}
