package com.clinicavet.clinica.model;

import jakarta.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Secretario extends Usuario {

    private String turno;
    private LocalDate dataAdmissao;

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    public LocalDate getDataAdmissao() { return dataAdmissao; }
    public void setDataAdmissao(LocalDate dataAdmissao) { this.dataAdmissao = dataAdmissao; }
}
