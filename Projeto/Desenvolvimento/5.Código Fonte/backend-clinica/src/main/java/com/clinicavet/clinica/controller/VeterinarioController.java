package com.clinicavet.clinica.controller;

import com.clinicavet.clinica.model.Veterinario;
import com.clinicavet.clinica.service.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veterinarios")
public class VeterinarioController {

    @Autowired
    private VeterinarioService veterinarioService;

    @GetMapping
    public List<Veterinario> listarTodos() {
        return veterinarioService.listarTodos();
    }

    @GetMapping("/{id}")
    public Veterinario buscarPorId(@PathVariable Long id) {
        return veterinarioService.buscarPorId(id);
    }

    @PostMapping
    public Veterinario salvar(@RequestBody Veterinario veterinario) {
        return veterinarioService.salvar(veterinario);
    }

    @PutMapping("/{id}")
    public Veterinario atualizar(@PathVariable Long id, @RequestBody Veterinario veterinario) {
        veterinario.setId(id);
        return veterinarioService.atualizar(veterinario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        veterinarioService.deletar(id);
    }
}
