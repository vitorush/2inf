package com.eeep.ocorrencia.model;

public class Disciplina {
    private String nome;
    private Integer codigo;

    public Disciplina() {
    }

    public Disciplina(String nome, Integer codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
