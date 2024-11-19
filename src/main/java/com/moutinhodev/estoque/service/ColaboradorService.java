package com.moutinhodev.estoque.service;

import com.moutinhodev.estoque.model.Colaborador;
import com.moutinhodev.estoque.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColaboradorService {

    @Autowired
    private ColaboradorRepository colaboradorRepository;

    public List<Colaborador> listarColaboradores(){
        return colaboradorRepository.findAll();
    }

    public Colaborador salvarColaborador(Colaborador colaborador){
        return colaboradorRepository.save(colaborador);
    }

    public Optional<Colaborador> buscarPorId(Long id){
        return colaboradorRepository.findById(id);
    }

    public void deletarColaborador(Long id){
        colaboradorRepository.deleteById(id);
    }

}
