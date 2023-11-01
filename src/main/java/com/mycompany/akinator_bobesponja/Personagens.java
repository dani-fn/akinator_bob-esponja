package com.mycompany.akinator_bobesponja;

public class Personagens {
    public String nome;
    public String especie;
    public String profissao;
    public String localTrabalho;
    public char sexo;
    //public boolean propriedade;

    public Personagens(String nome, String especie, String profissao, String localTrabalho, char sexo) {
        this.nome = nome;
        this.especie = especie;
        this.profissao = profissao;
        this.localTrabalho = localTrabalho;
        this.sexo = sexo;
    }
    
    public Personagens(String nome, String especie , String localTrabalho, char sexo) {
        this.nome = nome;
        this.especie = especie;
        this.localTrabalho = localTrabalho;
        this.sexo = sexo;
    }
    
    public bool temEmprego() {
        if (this.profissao.equals("")) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
}
