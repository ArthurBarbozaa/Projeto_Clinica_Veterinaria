package com.clinicavet.clinica.model;

import jakarta.persistence.Entity;

@Entity
public class Veterinario extends Usuario {

    private String crmv;
    private String especialidade;

    public String getCrmv() { return crmv; }
    public void setCrmv(String crmv) { this.crmv = crmv; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
}
