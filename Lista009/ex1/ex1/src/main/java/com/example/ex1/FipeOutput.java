package com.example.ex1;

public class FipeOutput {
    private double valor;
    private String mes;

    public FipeOutput(double valor, String mes) {
        this.valor = valor;
        this.mes = mes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
