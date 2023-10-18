package com.mycompany.akinator_bobesponja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class JogoPerguntas {

    private List<Pergunta> perguntas;
    private int pontuacao;

    public JogoPerguntas() {
        perguntas = new ArrayList<>();
        // Adicione suas perguntas aqui
        perguntas.add(new Pergunta("Qual é a casa em Hogwarts conhecida por sua coragem e bravura?", "Lufa-Lufa", "Sonserina", "Grifinória", 'c'));
        perguntas.add(new Pergunta("Qual animal é o símbolo da casa Grifinória?", "Cervo", "Coruja", "Leão", 'c'));
        perguntas.add(new Pergunta("Qual é o nome completo de Harry Potter?", "Harry James Potter", "Harry John Potter", "Harry Michael Potter", 'a'));
        perguntas.add(new Pergunta("Qual é a varinha mágica de Harry Potter?", "Varinha de Sabugueiro", "Varinha de Carvalho", "Varinha de Teixo", 'a'));
        perguntas.add(new Pergunta("Qual professor ensina Defesa Contra as Artes das Trevas em seu primeiro ano em Hogwarts?", "Professor Snape", "Professor Dumbledore", "Professor Quirrell", 'c'));
        perguntas.add(new Pergunta("Qual é o nome do elfo doméstico que serve à família Malfoy?", "Dobby", "Kreacher", "Winky", 'b'));
        perguntas.add(new Pergunta("Quem é o diretor da Escola de Magia e Bruxaria de Hogwarts?", "Professor Snape", "Professor Dumbledore", "Professor McGonagall", 'b'));
        perguntas.add(new Pergunta("Qual é a matéria que a professora Sybill Trelawney leciona em Hogwarts?", "Poções", "Transfiguração", "Adivinhação", 'c'));
        perguntas.add(new Pergunta("Qual é o nome do banco de bruxos que guarda o dinheiro de Harry Potter?", "Banco Mágico", "Banco das Bruxas", "Banco Gringotes", 'c'));
        perguntas.add(new Pergunta("Qual é o nome do vilão das histórias de Harry Potter?", "Lorde das Trevas", "Lorde do Fogo", "Lorde da Morte", 'a'));

    }

    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);
        pontuacao = 0;

        System.out.println("Bem-vindo ao jogo de perguntas e respostas!\n");

        for (Pergunta pergunta : perguntas) {
            pergunta.exibirPergunta();
            System.out.print("Sua resposta: ");
            char resposta = scanner.nextLine().charAt(0);

            if (pergunta.verificarResposta(resposta)) {
                System.out.println("Resposta correta!\n");
                pontuacao++;
            } else {
                System.out.println("Resposta incorreta. A resposta correta era: " + pergunta.getRespostaCorreta());
            }
        }

        System.out.println("Pontuação final: " + pontuacao + " de " + perguntas.size() + " perguntas.");
    }

    public void iniciarJogoPerguntasAleatorias() {
        Scanner scanner = new Scanner(System.in);
        pontuacao = 0;

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
                pontuacao++;
            } else {
                System.out.println("Resposta incorreta. A resposta correta era: " + pergunta.getRespostaCorreta());
            }

            // Remova a pergunta da lista de perguntas não respondidas
            perguntasNaoRespondidas.remove(indiceAleatorio);
        }

        System.out.println("Pontuação final: " + pontuacao + " de " + perguntas.size() + " perguntas.");
    }

    public void iniciarJogoLimitada() {
        Scanner scanner = new Scanner(System.in);
        pontuacao = 0;

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
                pontuacao++;
            } else {
                System.out.println("Resposta incorreta. A resposta correta era: " + pergunta.getRespostaCorreta());
            }

            // Remova a pergunta da lista de perguntas não respondidas
            perguntasNaoRespondidas.remove(indiceAleatorio);

            numPerguntasFeitas++; // Incrementa o contador de perguntas feitas
        }

        System.out.println("Pontuação final: " + pontuacao + " de " + numPerguntasLimit + " perguntas.");
    }

}