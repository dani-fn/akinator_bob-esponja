package com.mycompany.akinator_bobesponja;

public class Pergunta {

    private String pergunta;
    private boolean resposta;
    private char respostaCorreta;
    
    public Pergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void exibirPergunta() {
        System.out.println(pergunta);
    }

    public boolean verificarResposta(char resposta) {
        return resposta == respostaCorreta;
    }
}
