package com.clinicavet.clinica.controller;

import com.clinicavet.clinica.model.Secretario;
import com.clinicavet.clinica.service.SecretarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/secretarios")
public class SecretarioController {

    @Autowired
    private SecretarioService secretarioService;

    @GetMapping
    public List<Secretario> listarTodos() {
        return secretarioService.listarTodos();
    }

    @GetMapping("/{id}")
    public Secretario buscarPorId(@PathVariable Long id) {
        return secretarioService.buscarPorId(id);
    }

    @PostMapping
    public Secretario salvar(@RequestBody Secretario secretario) {
        return secretarioService.salvar(secretario);
    }

    @PutMapping("/{id}")
    public Secretario atualizar(@PathVariable Long id, @RequestBody Secretario secretario) {
        secretario.setId(id);
        return secretarioService.atualizar(secretario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        secretarioService.deletar(id);
    }
}
