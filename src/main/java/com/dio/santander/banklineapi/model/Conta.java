package com.dio.santander.banklineapi.model;

public class Conta {

    private long numero;
    private double salario;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Conta(long numero, double salario) {
        this.numero = numero;
        this.salario = salario;
    }

    public Conta(){

    }
}
