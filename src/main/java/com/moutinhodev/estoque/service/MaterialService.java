package com.moutinhodev.estoque.service;

import com.moutinhodev.estoque.model.Material;
import com.moutinhodev.estoque.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    public List<Material> listarMateriais(){
        return materialRepository.findAll();
    }

    public Material salvarMaterial(Material material){
        return materialRepository.save(material);
    }

    public Optional<Material> buscarPorId(Long id){
        return materialRepository.findById(id);
    }

    public void deletarMaterial(Long id){
        materialRepository.deleteById(id);
    }
}
