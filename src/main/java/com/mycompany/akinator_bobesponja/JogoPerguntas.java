package com.mycompany.akinator_bobesponja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Essa é apenas a base do código do jogo, precisamos entender tudo melhor e criar a UI

public class JogoPerguntas {
    private List<Personagens> personagens;
    private List<Pergunta> perguntas;

    public JogoPerguntas() {
        personagens = new ArrayList<>();
        perguntas = new ArrayList<>();

        // Adicione os personagens aqui

        // Adicione as perguntas aqui
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
        for (Pergunta pergunta : perguntas) {
            pergunta.exibirPergunta();
            String resposta = scanner.nextLine();

            // Lógica do jogo aqui
            // Este é apenas um exemplo. Você precisará adaptar isso para se adequar às suas classes e perguntas.
            if (pergunta.getPergunta().equals("Seu personagem é do sexo M ou F?")) {
                personagens = personagens.stream()
                    .filter(p -> p.sexo == resposta.charAt(0))
                    .collect(Collectors.toList());
            } else if (pergunta.getPergunta().equals("Seu personagem tem um emprego?")) {
                // Implemente a lógica aqui
            } else if (pergunta.getPergunta().equals("Seu personagem trabalha com comida?")) {
                // Implemente a lógica aqui
            } else if (pergunta.getPergunta().equals("Seu personagem trabalha no Siri Cascudo?")) {
                // Implemente a lógica aqui
            }

            if (personagens.size() == 1) {
                System.out.println("O seu personagem é " + personagens.get(0).nome + "!");
                break;
            }
        }
    }
}
