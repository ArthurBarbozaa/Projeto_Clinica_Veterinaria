package com.clinicavet.clinica.service;

import com.clinicavet.clinica.model.Secretario;
import com.clinicavet.clinica.repository.SecretarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SecretarioService {

    @Autowired
    private SecretarioRepository secretarioRepository;

    public List<Secretario> listarTodos() {
        return secretarioRepository.findAll();
    }

    public Secretario buscarPorId(Long id) {
        Optional<Secretario> secretario = secretarioRepository.findById(id);
        return secretario.orElse(null);
    }

    public Secretario salvar(Secretario secretario) {
        return secretarioRepository.save(secretario);
    }

    public Secretario atualizar(Secretario secretario) {
        return secretarioRepository.save(secretario);
    }

    public void deletar(Long id) {
        secretarioRepository.deleteById(id);
    }
}
