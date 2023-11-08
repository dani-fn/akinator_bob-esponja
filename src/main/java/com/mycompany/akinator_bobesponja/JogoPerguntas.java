package com.mycompany.akinator_bobesponja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JogoPerguntas {
    private List<Personagens> personagens;
    private final List<Pergunta> perguntas;

    public JogoPerguntas() {
        personagens = new ArrayList<>();
        perguntas = new ArrayList<>();

        personagens.add(new Personagens("Bob Esponja", "Esponja", "Cozinheiro", "Siri Cascudo", 'M'));
        personagens.add(new Personagens("Patrick Estrela", "Estrela-do-mar", 'M'));
        personagens.add(new Personagens("Lula Molusco", "Lula", "Balconista", "Siri Cascudo", 'M'));
        personagens.add(new Personagens("Seu Siriguejo", "Caranguejo", "Proprietário", "Siri Cascudo", 'M'));
        personagens.add(new Personagens("Plankton", "Crustáceo", "Propritário", "Balde de Lixo", 'M'));
        personagens.add(new Personagens("Sandy", "Esquilo", "Cientista", "Home Office", 'F'));
        personagens.add(new Personagens("Gary", "Caracol", 'M'));
        personagens.add(new Personagens("Pérola", "Baleia", 'F'));
        personagens.add(new Personagens("Sra. Puff", "Baiacu", "Professora", "Escola de Pilotagem", 'F'));
        personagens.add(new Personagens("Karen", "Máquina", "Assistente pessoal", "Balde de Lixo", 'F'));
        

        perguntas.add(new Pergunta("Seu personagem é do sexo masculino?")); 
        perguntas.add(new Pergunta("Seu personagem tem um emprego?"));  
        perguntas.add(new Pergunta("Seu personagem trabalha com comida?")); 
        perguntas.add(new Pergunta("Seu personagem trabalha no Siri Cascudo?")); 
        perguntas.add(new Pergunta("Seu personagem é uma estrela-do-mar?"));  
        perguntas.add(new Pergunta("Seu personagem é dono do Balde de Lixo?"));  
        perguntas.add(new Pergunta("Seu personagem é dono do Siri Cascudo?"));  
        perguntas.add(new Pergunta("Seu personagem é um caracol?"));  
        perguntas.add(new Pergunta("Seu personagem é uma baleia?"));  
        perguntas.add(new Pergunta("Seu personagem é um esquilo?"));  
        perguntas.add(new Pergunta("Seu personagem é professora?"));  
        perguntas.add(new Pergunta("Seu personagem é uma máquina?"));
        perguntas.add(new Pergunta("Seu personagem é uma lula?"));
    }   

    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);
        for (Pergunta pergunta : perguntas) {
            pergunta.exibirPergunta();
            String resposta = scanner.nextLine();
            
            if (pergunta.getPergunta().equals("Seu personagem é do sexo M ou F?")) {
                List<Personagens> personagensFiltrados = new ArrayList<>();
                for (Personagens p : personagens) {
                    if (p.getSexo() == resposta.charAt(0)) {
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
            } else if (pergunta.getPergunta().equals("Seu personagem é uma estrela-do-mar?")) {
                boolean verificaEstrela = resposta.equalsIgnoreCase("sim");
                List<Personagens> personagensFiltrados = new ArrayList<>();
                for (Personagens p : personagens) {
                    if (p.verificaEstrela() == verificaEstrela) {
                        personagensFiltrados.add(p);
                    }
                }
                personagens = personagensFiltrados;
            } else if (pergunta.getPergunta().equals("Seu personagem é dono do Balde de Lixo?")) {
                boolean donoBaldedeLixo = resposta.equalsIgnoreCase("sim");
                List<Personagens> personagensFiltrados = new ArrayList<>();
                for (Personagens p : personagens) {
                    if (p.donoBaldedeLixo() == donoBaldedeLixo) {
                        personagensFiltrados.add(p);
                    }
                }
                personagens = personagensFiltrados;
            } else if (pergunta.getPergunta().equals("Seu personagem é dono do Siri Cascudo?")) {
                boolean donoSiriCascudo = resposta.equalsIgnoreCase("sim");
                List<Personagens> personagensFiltrados = new ArrayList<>();
                for (Personagens p : personagens) {
                    if (p.donoSiriCascudo() == donoSiriCascudo) {
                        personagensFiltrados.add(p);
                    }
                }
                personagens = personagensFiltrados;
            } else if (pergunta.getPergunta().equals("Seu personagem é um caracol?")) {
                boolean verificaCaracol = resposta.equalsIgnoreCase("sim");
                List<Personagens> personagensFiltrados = new ArrayList<>();
                for (Personagens p : personagens) {
                    if (p.verificaCaracol() == verificaCaracol) {
                        personagensFiltrados.add(p);
                    }
                }
                personagens = personagensFiltrados;
            } else if (pergunta.getPergunta().equals("Seu personagem é uma baleia?")) {
                boolean verificaBaleia = resposta.equalsIgnoreCase("sim");
                List<Personagens> personagensFiltrados = new ArrayList<>();
                for (Personagens p : personagens) {
                    if (p.verificaBaleia() == verificaBaleia) {
                        personagensFiltrados.add(p);
                    }
                }
                personagens = personagensFiltrados;
            } else if (pergunta.getPergunta().equals("Seu personagem é um esquilo?")) {
                boolean verificaEsquilo = resposta.equalsIgnoreCase("sim");
                List<Personagens> personagensFiltrados = new ArrayList<>();
                for (Personagens p : personagens) {
                    if (p.verificaEsquilo() == verificaEsquilo) {
                        personagensFiltrados.add(p);
                    }
                }
                personagens = personagensFiltrados;
            } else if (pergunta.getPergunta().equals("Seu personagem é uma professora?")) {
                boolean verificaProfessora = resposta.equalsIgnoreCase("sim");
                List<Personagens> personagensFiltrados = new ArrayList<>();
                for (Personagens p : personagens) {
                    if (p.verificaProfessora() == verificaProfessora) {
                        personagensFiltrados.add(p);
                    }
                }
                personagens = personagensFiltrados;
            } else if (pergunta.getPergunta().equals("Seu personagem é uma máquina?")) {
                boolean verificaMaquina = resposta.equalsIgnoreCase("sim");
                List<Personagens> personagensFiltrados = new ArrayList<>();
                for (Personagens p : personagens) {
                    if (p.verificaMaquina() == verificaMaquina) {
                        personagensFiltrados.add(p);
                    }
                }
                personagens = personagensFiltrados;
            } else if (pergunta.getPergunta().equals("Seu personagem é uma lula?")) {
                boolean verificaLula = resposta.equalsIgnoreCase("sim");
                List<Personagens> personagensFiltrados = new ArrayList<>();
                for (Personagens p : personagens) {
                    if (p.verificaLula() == verificaLula) {
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


