package com.moutinhodev.estoque.controller;

import com.moutinhodev.estoque.model.Material;
import com.moutinhodev.estoque.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materiais")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping
    public List<Material> listarMateriais() {
        return materialService.listarMateriais();
    }

    @PostMapping
    public Material salvarMaterial(@RequestBody Material material) {
        return materialService.salvarMaterial(material);
    }

    @DeleteMapping("/{id}")
    public void deletarMaterial(@PathVariable Long id) {
        materialService.deletarMaterial(id);
    }

}
