
package com.agenda.entity;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class AplicativoTarefas {
    private List<Usuario> usuarios;
    private Usuario usuarioLogado;

    public AplicativoTarefas() {
        usuarios = new ArrayList<>();
        usuarioLogado = null;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public boolean autenticarUsuario(String nome, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)) {
                usuarioLogado = usuario;
                return true;
            }
        }
        return false;
    }

    public void listarTarefas() {
        if (usuarioLogado != null) {
            System.out.println("Tarefas para " + usuarioLogado.getNome() + ":");
            List<Tarefa> tarefas = usuarioLogado.getTarefas();
            for (Tarefa tarefa : tarefas) {
                System.out.println("Título: " + tarefa.getTitulo());
                System.out.println("Descrição: " + tarefa.getDescricao());
                System.out.println("Matéria: " + tarefa.getMateria());
                System.out.println("Data: " + tarefa.getData().format(DateTimeFormatter.ISO_LOCAL_DATE));
                System.out.println("Concluída: " + tarefa.getStatus());
                System.out.println("---------------");
            }
        } else {
            System.out.println("Nenhum usuário logado.");
        }
    }
    public void adicionarTarefa(String titulo, String descricao) {
        if (usuarioLogado != null) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Matéria da tarefa (Matemática, Português, Física, Química, Ensino Técnico, Biologia ou Nenhuma): ");
            String materia = scanner.nextLine();
    
            System.out.print("Data da tarefa (formato YYYY-MM-DD): ");
            String dataStr = scanner.nextLine();
            LocalDate data = LocalDate.parse(dataStr, DateTimeFormatter.ISO_LOCAL_DATE);
    
            Tarefa novaTarefa = new Tarefa(titulo, descricao, materia, data);
            usuarioLogado.adicionarTarefa(novaTarefa);
            System.out.println("Tarefa adicionada com sucesso!");
        } else {
            System.out.println("Nenhum usuário logado.");
        }
    }
    
    public void listarTarefasPorMateria(String materia) {
        if (usuarioLogado != null) {
            System.out.println("Tarefas para " + usuarioLogado.getNome() + " na matéria " + materia + ":");
            List<Tarefa> tarefas = usuarioLogado.getTarefas();

            boolean encontrouTarefas = false;

            for (Tarefa tarefa : tarefas) {
                if (tarefa.getMateria().equalsIgnoreCase(materia)) {
                    System.out.println("Título: " + tarefa.getTitulo());
                    System.out.println("Descrição: " + tarefa.getDescricao());
                    System.out.println("Concluída: " + tarefa.getStatus());
                    System.out.println("---------------");
                    encontrouTarefas = true;
                }
            }

            if (!encontrouTarefas) {
                System.out.println("Nenhuma tarefa encontrada para a matéria " + materia);
            }
        } else {
            System.out.println("Nenhum usuário logado.");
        }
    }

    public void marcarTarefaConcluida(int indice) {
        if (usuarioLogado != null) {
            List<Tarefa> tarefas = usuarioLogado.getTarefas();
    
            if (tarefas.isEmpty()) {
                System.out.println("Não há tarefas para marcar como concluídas.");
                return;
            }
    
            if (indice >= 0 && indice < tarefas.size()) {
                Tarefa tarefa = tarefas.get(indice);
                tarefa.marcarConcluida();
                System.out.println("Tarefa marcada como concluída: " + tarefa.getTitulo());
            } else {
                System.out.println("Índice inválido. Por favor, escolha um índice válido.");
            }
        } else {
            System.out.println("Nenhum usuário logado.");
        }
    }
    
    
    public void cadastrarNovoUsuario(String nome, String senha) {
        Usuario novoUsuario = new Usuario(nome, senha);
        adicionarUsuario(novoUsuario);
    }

    public void listarUsuarios() {
        System.out.println("Usuários cadastrados:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nome de usuário: " + usuario.getNome());
        }
    }
}

