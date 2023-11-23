package com.agenda.entity;

import java.time.LocalDate;

class Tarefa {
    private String titulo;
    private String descricao;
    private boolean concluida;
    private String materia;
    private LocalDate data;

    public Tarefa(String titulo, String descricao, String materia, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
        this.materia = materia;
        this.data = data;
    }
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarConcluida() {
        concluida = true;
    }

    public void desmarcarConcluida() {
        concluida = false;
    }

    public String getStatus(){
        return (concluida ? "Concluída" : "Não concluida");
    }
}