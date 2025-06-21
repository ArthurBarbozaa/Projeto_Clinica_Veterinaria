package com.clinicavet.clinica.service;

import com.clinicavet.clinica.model.Vacina;
import com.clinicavet.clinica.repository.VacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VacinaService {

    @Autowired
    private VacinaRepository vacinaRepository;

    public List<Vacina> listarTodos() {
        return vacinaRepository.findAll();
    }

    public Vacina buscarPorId(Long id) {
        Optional<Vacina> vacina = vacinaRepository.findById(id);
        return vacina.orElse(null);
    }

    public Vacina salvar(Vacina vacina) {
        return vacinaRepository.save(vacina);
    }

    public Vacina atualizar(Vacina vacina) {
        return vacinaRepository.save(vacina);
    }

    public void deletar(Long id) {
        vacinaRepository.deleteById(id);
    }
}
