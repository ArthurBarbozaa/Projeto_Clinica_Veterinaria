package com.clinicavet.clinica.controller;

import com.clinicavet.clinica.model.Vacina;
import com.clinicavet.clinica.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vacinas")
public class VacinaController {

    @Autowired
    private VacinaService vacinaService;

    @GetMapping
    public List<Vacina> listarTodos() {
        return vacinaService.listarTodos();
    }

    @GetMapping("/{id}")
    public Vacina buscarPorId(@PathVariable Long id) {
        return vacinaService.buscarPorId(id);
    }

    @PostMapping
    public Vacina salvar(@RequestBody Vacina vacina) {
        return vacinaService.salvar(vacina);
    }

    @PutMapping("/{id}")
    public Vacina atualizar(@PathVariable Long id, @RequestBody Vacina vacina) {
        vacina.setId(id);
        return vacinaService.atualizar(vacina);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        vacinaService.deletar(id);
    }
}
