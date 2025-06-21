package com.clinicavet.clinica.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private LocalDateTime horario;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private EstadoConsulta estadoConsulta;

    @ManyToOne
    private Pet pet;

    @ManyToOne
    private Veterinario veterinario;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public LocalDateTime getHorario() { return horario; }
    public void setHorario(LocalDateTime horario) { this.horario = horario; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public EstadoConsulta getEstadoConsulta() { return estadoConsulta; }
    public void setEstadoConsulta(EstadoConsulta estadoConsulta) { this.estadoConsulta = estadoConsulta; }

    public Pet getPet() { return pet; }
    public void setPet(Pet pet) { this.pet = pet; }

    public Veterinario getVeterinario() { return veterinario; }
    public void setVeterinario(Veterinario veterinario) { this.veterinario = veterinario; }
}
