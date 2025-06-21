package com.clinicavet.clinica.service;

import com.clinicavet.clinica.model.Pet;
import com.clinicavet.clinica.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public List<Pet> listarTodos() {
        return petRepository.findAll();
    }

    public Pet buscarPorId(Long id) {
        Optional<Pet> pet = petRepository.findById(id);
        return pet.orElse(null);
    }

    public Pet salvar(Pet pet) {
        return petRepository.save(pet);
    }

    public Pet atualizar(Pet pet) {
        return petRepository.save(pet);
    }

    public void deletar(Long id) {
        petRepository.deleteById(id);
    }
}
