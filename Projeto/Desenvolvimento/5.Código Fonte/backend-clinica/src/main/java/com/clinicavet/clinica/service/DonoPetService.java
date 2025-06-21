package com.clinicavet.clinica.service;

import com.clinicavet.clinica.model.DonoPet;
import com.clinicavet.clinica.repository.DonoPetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonoPetService {

    @Autowired
    private DonoPetRepository donoPetRepository;

    public List<DonoPet> listarTodos() {
        return donoPetRepository.findAll();
    }

    public DonoPet buscarPorId(Long id) {
        Optional<DonoPet> donoPet = donoPetRepository.findById(id);
        return donoPet.orElse(null);  // Pode melhorar tratando exceção depois
    }

    public DonoPet salvar(DonoPet donoPet) {
        return donoPetRepository.save(donoPet);
    }

    public DonoPet atualizar(DonoPet donoPet) {
        // Pode colocar regra para validar se existe antes
        return donoPetRepository.save(donoPet);
    }

    public void deletar(Long id) {
        donoPetRepository.deleteById(id);
    }
}
