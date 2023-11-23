package com.agenda.entity;

import java.util.ArrayList;
import java.util.List;

class AplicativoTarefas {
    private List<Usuario> usuarios;
    private Usuario usuarioLogado;
    private List<Tarefa> tarefas;

    public AplicativoTarefas() {
        usuarios = new ArrayList<>();
        usuarioLogado = null;
        tarefas = new ArrayList<>();
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
        System.out.println("Tarefas para " + usuarioLogado.getNome() + ":");
        for (Tarefa tarefa : tarefas) {
            System.out.println("Título: " + tarefa.getTitulo());
            System.out.println("Descrição: " + tarefa.getDescricao());
            System.out.println("Concluída: " + (tarefa.isConcluida() ? "Sim" : "Não"));
            System.out.println("---------------");
        }
    }

    public void adicionarTarefa(String titulo, String descricao) {
        Tarefa novaTarefa = new Tarefa(titulo, descricao);
        tarefas.add(novaTarefa);
    }

    public void marcarTarefaConcluida(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            Tarefa tarefa = tarefas.get(indice);
            tarefa.marcarConcluida();
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

