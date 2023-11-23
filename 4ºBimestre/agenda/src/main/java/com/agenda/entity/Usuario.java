package com.agenda.entity;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nome;
    private String senha;
    private List<Tarefa> tarefas;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }
}
