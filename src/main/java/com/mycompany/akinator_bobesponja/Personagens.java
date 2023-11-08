package com.mycompany.akinator_bobesponja;

public class Personagens {
    public String nome;
    public String especie;
    public String profissao;
    public String localTrabalho;
    public char sexo;

    public Personagens(String nome, String especie, String profissao, String localTrabalho, char sexo) {
        this.nome = nome;
        this.especie = especie;
        this.profissao = profissao;
        this.localTrabalho = localTrabalho;
        this.sexo = sexo;
    }
    
    public Personagens(String nome, String especie, char sexo) {
        this.nome = nome;
        this.especie = especie;
        this.sexo = sexo;
    }

    public boolean temEmprego() {
        return profissao != null && !profissao.isEmpty();
    }
    
     public boolean trabalhaComida() {
         return (profissao != null && profissao.equalsIgnoreCase("Cozinheiro"));
    }
     
      public boolean trabalhaSiriCascudo() {
        return localTrabalho != null && localTrabalho.equalsIgnoreCase("Siri Cascudo");
    }
    
      public boolean verificaEstrela() {
        return especie != null && especie.equalsIgnoreCase("Estrela-do-Mar");
    }
      
      public boolean donoSiriCascudo() {
        return (profissao != null && profissao.equalsIgnoreCase("Proprietario")) &&
               (localTrabalho != null && localTrabalho.equalsIgnoreCase("Siri Cascudo"));
     }
     
      public boolean donoBaldedeLixo() {
        return (profissao != null && profissao.equalsIgnoreCase("Proprietario")) &&
               (localTrabalho != null && localTrabalho.equalsIgnoreCase("Balde de Lixo"));
    }
      
      public boolean verificaCaracol() {
        return especie != null && especie.equalsIgnoreCase("Caracol");
    }
      
      public boolean verificaBaleia() {
        return especie != null && especie.equalsIgnoreCase("Baleia");
    }
      
      public boolean verificaEsquilo() {
        return especie != null && especie.equalsIgnoreCase("Esquilo");
    }
      
      public boolean verificaProfessora() {
        return profissao != null && profissao.equalsIgnoreCase("Professora");
    }
      
      public boolean verificaMaquina() {
        return especie != null && especie.equalsIgnoreCase("Maquina");
    }
      
      public boolean verificaLula() {
        return especie != null && especie.equalsIgnoreCase("Lula");
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
