package com.clinicavet.clinica.model;

import jakarta.persistence.Entity;

@Entity
public class DonoPet extends Usuario {

    private String documento;
    private String telefone;
    private String endereco;

    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}
