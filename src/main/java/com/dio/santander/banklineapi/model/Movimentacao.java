package com.dio.santander.banklineapi.model;

import java.time.LocalDateTime;

public class Movimentacao {

    private int id;
    private LocalDateTime dataHora;
    private String descricao;
    private double valor;
    private MovimentacaoTipo tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public MovimentacaoTipo getTipo() {
        return tipo;
    }

    public void setTipo(MovimentacaoTipo tipo) {
        this.tipo = tipo;
    }

    public Movimentacao(int id, LocalDateTime dataHora, String descricao, double valor, MovimentacaoTipo tipo) {
        this.id = id;
        this.dataHora = dataHora;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Movimentacao(){

    }
}
