package com.agenda.entity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AplicativoTarefas aplicativo = new AplicativoTarefas();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual será o seu nome de Usuário? ");
        String novoNomeUsuario = scanner.nextLine();
        System.out.print("Qual será a senha? ");
        String novaSenha = scanner.nextLine();

        aplicativo.cadastrarNovoUsuario(novoNomeUsuario, novaSenha);

        System.out.println("Usuário cadastrado com sucesso!\n");

        System.out.print("Página de Login:\n ");
        System.out.print("Nome do Usuário para Login: ");
        String nomeUsuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        
        while (!aplicativo.autenticarUsuario(nomeUsuario, senha)) {
            System.out.println("Autenticação falhou. Usuário ou senha incorretos. Tente novamente.");
        
            System.out.print("Nome de usuário: ");
            nomeUsuario = scanner.nextLine();
            System.out.print("Senha: ");
            senha = scanner.nextLine();
        }
        
        System.out.println("Autenticação bem-sucedida!");
        

        boolean executando = true;

        while (executando) {
            System.out.println("\nOpções:");
            System.out.println("1. Listar tarefas");
            System.out.println("2. Adicionar tarefa");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Listar usuários");
            System.out.println("5. Cadastrar novo usuário");
            System.out.println("6. Mudar usuário");
            System.out.println("7. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar a quebra de linha

            switch (escolha) {
                case 1:
                    aplicativo.listarTarefas();
                    break;
                case 2:
                    System.out.print("Título da tarefa: ");
                    String tituloTarefa = scanner.nextLine();
                    System.out.print("Descrição da tarefa: ");
                    String descricaoTarefa = scanner.nextLine();
                    aplicativo.adicionarTarefa(tituloTarefa, descricaoTarefa);
                    break;
                case 3:
                    System.out.print("Índice da tarefa para marcar como concluída: ");
                    int indiceTarefa = scanner.nextInt();
                    aplicativo.marcarTarefaConcluida(indiceTarefa);
                    break;
                case 4:
                    aplicativo.listarUsuarios();
                    break;
                case 5:
                    System.out.print("Novo nome de usuário: ");
                    novoNomeUsuario = scanner.nextLine();
                    System.out.print("Senha: ");
                    novaSenha = scanner.nextLine();
                    aplicativo.cadastrarNovoUsuario(novoNomeUsuario, novaSenha);
                    break;
                case 6:
                    System.out.print("Nome de usuário: ");
                    nomeUsuario = scanner.nextLine();
                    System.out.print("Senha: ");
                    senha = scanner.nextLine();

                    while (!aplicativo.autenticarUsuario(nomeUsuario, senha)) {
                        System.out.println("Autenticação falhou. Usuário ou senha incorretos.");

                        System.out.print("Nome de usuário: ");
                        nomeUsuario = scanner.nextLine();
                        System.out.print("Senha: ");
                        senha = scanner.nextLine();
                    }

                    System.out.println("Usuário alterado com sucesso!");
                    break;
                case 7:
                    executando = false;
                    System.out.println("Saindo do aplicativo.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
