package com.clinicavet.clinica.model;

import jakarta.persistence.*;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String raca;
    private int idade;
    private String sexo;
    private int peso;

    @ManyToOne
    private DonoPet dono;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public int getPeso() { return peso; }
    public void setPeso(int peso) { this.peso = peso; }

    public DonoPet getDono() { return dono; }
    public void setDono(DonoPet dono) { this.dono = dono; }
}
