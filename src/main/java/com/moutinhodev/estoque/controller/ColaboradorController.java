package com.moutinhodev.estoque.controller;


import com.moutinhodev.estoque.model.Colaborador;
import com.moutinhodev.estoque.service.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorService colaboradorService;

    @GetMapping
    public List<Colaborador> listarColaboradores(){
        return colaboradorService.listarColaboradores();
    }

    @PostMapping
    public Colaborador salvarColaborador(@RequestBody Colaborador colaborador){
        return colaboradorService.salvarColaborador(colaborador);
    }
}
