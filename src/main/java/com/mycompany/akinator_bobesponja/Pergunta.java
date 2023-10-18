package com.mycompany.akinator_bobesponja;

public class Pergunta {

    private String pergunta;
    private String opcaoA;
    private String opcaoB;
    private String opcaoC;
    private char respostaCorreta;

    public Pergunta(String pergunta, String opcaoA, String opcaoB, String opcaoC, char respostaCorreta) {
        this.pergunta = pergunta;
        this.opcaoA = opcaoA;
        this.opcaoB = opcaoB;
        this.opcaoC = opcaoC;
        this.respostaCorreta = respostaCorreta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void exibirPergunta() {
        System.out.println(pergunta);
        System.out.println("a) " + opcaoA);
        System.out.println("b) " + opcaoB);
        System.out.println("c) " + opcaoC);
    }

    public char getRespostaCorreta() {
        return respostaCorreta;
    }

    public boolean verificarResposta(char resposta) {
        return resposta == respostaCorreta;
    }
}