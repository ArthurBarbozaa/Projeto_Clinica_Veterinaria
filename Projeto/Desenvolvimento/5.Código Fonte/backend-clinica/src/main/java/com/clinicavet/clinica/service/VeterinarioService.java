package com.clinicavet.clinica.service;

import com.clinicavet.clinica.model.Veterinario;
import com.clinicavet.clinica.repository.VeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinarioService {

    @Autowired
    private VeterinarioRepository veterinarioRepository;

    public List<Veterinario> listarTodos() {
        return veterinarioRepository.findAll();
    }

    public Veterinario buscarPorId(Long id) {
        Optional<Veterinario> veterinario = veterinarioRepository.findById(id);
        return veterinario.orElse(null);
    }

    public Veterinario salvar(Veterinario veterinario) {
        return veterinarioRepository.save(veterinario);
    }

    public Veterinario atualizar(Veterinario veterinario) {
        return veterinarioRepository.save(veterinario);
    }

    public void deletar(Long id) {
        veterinarioRepository.deleteById(id);
    }
}
