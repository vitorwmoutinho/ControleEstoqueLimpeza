package com.moutinhodev.estoque.controller;


import com.moutinhodev.estoque.model.Retirada;
import com.moutinhodev.estoque.service.RetiradaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/retiradas")
public class RetiradaController {

    @Autowired
    private RetiradaService retiradaService;

    @GetMapping
    public List<Retirada> listarRetiradas() {
        return retiradaService.l
    }

    @PostMapping
    public Retirada salvarRetirada(@RequestBody Retirada retirada) {
        return retiradaService.salvarRetirada(retirada);
    }
}
