package com.clinicavet.clinica.controller;

import com.clinicavet.clinica.model.DonoPet;
import com.clinicavet.clinica.service.DonoPetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donospet")
public class DonoPetController {

    @Autowired
    private DonoPetService donoPetService;

    @GetMapping
    public List<DonoPet> listarTodos() {
        return donoPetService.listarTodos();
    }

    @GetMapping("/{id}")
    public DonoPet buscarPorId(@PathVariable Long id) {
        return donoPetService.buscarPorId(id);
    }

    @PostMapping
    public DonoPet salvar(@RequestBody DonoPet donoPet) {
        return donoPetService.salvar(donoPet);
    }

    @PutMapping("/{id}")
    public DonoPet atualizar(@PathVariable Long id, @RequestBody DonoPet donoPet) {
        donoPet.setId(id);
        return donoPetService.atualizar(donoPet);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        donoPetService.deletar(id);
    }
}
