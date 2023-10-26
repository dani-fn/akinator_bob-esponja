package com.mycompany.akinator_bobesponja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JogoPerguntas {
    private List<Personagens> personagens;
    private List<Pergunta> perguntas;

    public JogoPerguntas() {
        personagens = new ArrayList<>();
        perguntas = new ArrayList<>();

        // Adicione os personagens aqui

        // Adicione as perguntas aqui
        // As perguntas foram atualizadas para serem mais específicas
        perguntas.add(new Pergunta("Seu personagem é do sexo M ou F?"));
        perguntas.add(new Pergunta("Seu personagem tem um emprego?"));
        perguntas.add(new Pergunta("Seu personagem trabalha com comida?"));
        perguntas.add(new Pergunta("Seu personagem trabalha no Siri Cascudo?"));
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
        for (Pergunta pergunta : perguntas) {
            pergunta.exibirPergunta();
            String resposta = scanner.nextLine();

            // Lógica do jogo aqui
            // Este é apenas um exemplo. Você precisará adaptar isso para se adequar às suas classes e perguntas.

//          for (Personagens p : personagens) {
//    if (p.getSexo() == resposta.charAt(0)) {
//        personagensFiltrados.add(p);
//    }
//}

            if (pergunta.getPergunta().equals("Seu personagem é do sexo M ou F?")) {
                List<Personagens> personagensFiltrados = new ArrayList<>();
                for (Personagens p : personagens) {
                    if (p.getSexo().equalsIgnoreCase(resposta)) {
                        personagensFiltrados.add(p);
                    }
                }
                personagens = personagensFiltrados;
            } else if (pergunta.getPergunta().equals("Seu personagem tem um emprego?")) {
                boolean temEmprego = resposta.equalsIgnoreCase("sim");
                List<Personagens> personagensFiltrados = new ArrayList<>();
                for (Personagens p : personagens) {
                    if (p.temEmprego() == temEmprego) {
                        personagensFiltrados.add(p);
                    }
                }
                personagens = personagensFiltrados;
            } else if (pergunta.getPergunta().equals("Seu personagem trabalha com comida?")) {
                boolean trabalhaComida = resposta.equalsIgnoreCase("sim");
                List<Personagens> personagensFiltrados = new ArrayList<>();
                for (Personagens p : personagens) {
                    if (p.trabalhaComida() == trabalhaComida) {
                        personagensFiltrados.add(p);
                    }
                }
                personagens = personagensFiltrados;
            } else if (pergunta.getPergunta().equals("Seu personagem trabalha no Siri Cascudo?")) {
                boolean trabalhaSiriCascudo = resposta.equalsIgnoreCase("sim");
                List<Personagens> personagensFiltrados = new ArrayList<>();
                for (Personagens p : personagens) {
                    if (p.trabalhaSiriCascudo() == trabalhaSiriCascudo) {
                        personagensFiltrados.add(p);
                    }
                }
                personagens = personagensFiltrados;
            }

            if (personagens.size() == 1) {
                System.out.println("O seu personagem é " + personagens.get(0).getNome() + "!");
                break;
            }
        }
    }
}



