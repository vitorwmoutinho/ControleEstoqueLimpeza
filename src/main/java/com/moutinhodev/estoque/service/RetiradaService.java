package com.moutinhodev.estoque.service;


import com.moutinhodev.estoque.model.Retirada;
import com.moutinhodev.estoque.repository.RetiradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetiradaService {

    @Autowired
    RetiradaRepository retiradaRepository;

    public List<Retirada> listarRetiradas(){
        return retiradaRepository.findAll();
    }

    public Retirada salvarRetirada(Retirada retirada){
        return retiradaRepository.save(retirada);
    }
}
