package com.eeep.ocorrencia.model;

public class Disciplina {

    private Integer codigo;
    private String nome;

    public Disciplina() {
    }

    public Disciplina(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
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