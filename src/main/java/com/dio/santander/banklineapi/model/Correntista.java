package com.dio.santander.banklineapi.model;

public class Correntista {

    private int id;
    private String cpf;
    private String nome;
    private Conta conta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Correntista(int id, String cpf, String nome, Conta conta) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.conta = conta;
    }

    public Correntista(){

    }

}
