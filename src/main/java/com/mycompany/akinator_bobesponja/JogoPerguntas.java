package com.mycompany.akinator_bobesponja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class JogoPerguntas {

    private List<Pergunta> perguntas;
    private int acertos;

    public JogoPerguntas() {
        perguntas = new ArrayList<>();
        // Adicione suas perguntas aqui
        perguntas.add(new Pergunta("Seu personagem é do sexo M ou F?"));
        perguntas.add(new Pergunta("Seu personagem tem um emprego?"));
        perguntas.add(new Pergunta("Seu personagem trabalha com comida?"));
        perguntas.add(new Pergunta("Seu personagem trabalha no Siri Cascudo?"));
        perguntas.add(new Pergunta("...............?"));
        perguntas.add(new Pergunta("Seu personagem é uma estrela-do-mar?"));
        perguntas.add(new Pergunta("Seu personagem mora em um abacaxi?"));
        perguntas.add(new Pergunta("Seu personagem é dono do Balde de Lixo?"));
        perguntas.add(new Pergunta("Seu personagem é dono do Siri Cascudo?"));
        perguntas.add(new Pergunta("Seu personagem é um caracol?"));
        perguntas.add(new Pergunta("Seu personagem é uma baleia?"));
        perguntas.add(new Pergunta("Seu personagem é um esquilo?"));
        perguntas.add(new Pergunta("Seu personagem é professora?"));
        perguntas.add(new Pergunta("Seu personagem é uma máquina?"));
        
    }

    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);
        acertos = 0;

        System.out.println("Bem-vindo ao Akinator da Fenda do Bikini!\n");

        for (Pergunta pergunta : perguntas) {
            pergunta.exibirPergunta();
            System.out.print("Sua resposta: ");
            char resposta = scanner.nextLine().charAt(0);

            if (pergunta.verificarResposta(resposta)) {
                System.out.println("Resposta correta!\n");
                acertos++;
            } else {
                System.out.println("Resposta incorreta. A resposta correta era: " + pergunta.getRespostaCorreta());
            }
        }

        System.out.println("Pontuação final: " + acertos + " de " + perguntas.size() + " perguntas.");
    }

    public void iniciarJogoPerguntasAleatorias() {
        Scanner scanner = new Scanner(System.in);
        acertos = 0;

        System.out.println("Bem-vindo ao jogo de perguntas e respostas!\n");

        List<Pergunta> perguntasNaoRespondidas = new ArrayList<>(perguntas); // Copie todas as perguntas inicialmente

        while (!perguntasNaoRespondidas.isEmpty()) {
            int indiceAleatorio = new Random().nextInt(perguntasNaoRespondidas.size());
            Pergunta pergunta = perguntasNaoRespondidas.get(indiceAleatorio);

            pergunta.exibirPergunta();
            System.out.print("Sua resposta: ");
            char resposta = scanner.nextLine().charAt(0);

            if (pergunta.verificarResposta(resposta)) {
                System.out.println("Resposta correta!\n");
                acertos++;
            } else {
                System.out.println("Resposta incorreta. A resposta correta era: " + pergunta.getRespostaCorreta());
            }

            // Remova a pergunta da lista de perguntas não respondidas
            perguntasNaoRespondidas.remove(indiceAleatorio);
        }

        System.out.println("Pontuação final: " + acertos + " de " + perguntas.size() + " perguntas.");
    }

    public void iniciarJogoLimitada() {
        Scanner scanner = new Scanner(System.in);
        acertos = 0;

        System.out.println("Bem-vindo ao jogo de perguntas e respostas!\n");

        List<Pergunta> perguntasNaoRespondidas = new ArrayList<>(perguntas); // Copie todas as perguntas inicialmente
        int numPerguntasLimit = 5; // Limite de 5 perguntas

        int numPerguntasFeitas = 0; // Contador de perguntas feitas

        while (!perguntasNaoRespondidas.isEmpty() && numPerguntasFeitas < numPerguntasLimit) {
            int indiceAleatorio = new Random().nextInt(perguntasNaoRespondidas.size());
            Pergunta pergunta = perguntasNaoRespondidas.get(indiceAleatorio);

            pergunta.exibirPergunta();
            System.out.print("Sua resposta: ");
            char resposta = scanner.nextLine().charAt(0);

            if (pergunta.verificarResposta(resposta)) {
                System.out.println("Resposta correta!\n");
                acertos++;
            } else {
                System.out.println("Resposta incorreta. A resposta correta era: " + pergunta.getRespostaCorreta());
            }

            // Remova a pergunta da lista de perguntas não respondidas
            perguntasNaoRespondidas.remove(indiceAleatorio);

            numPerguntasFeitas++; // Incrementa o contador de perguntas feitas
        }

        System.out.println("Pontuação final: " + acertos + " de " + numPerguntasLimit + " perguntas.");
    }

}
