package com.algaworks.estoque;

import java.util.Objects;

public class Carro implements Estocavel {
    private String modelo;
    private int quantidadeDeEstoque;

    public Carro(String modelo, int quantidadeDeEstoque) {
        Objects.requireNonNull("Não pode ser nulo", modelo);
        this.modelo = modelo;
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuantidadeDeEstoque(int quantidadeDeEstoque) {
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }

    @Override
    public int getQuantidadeDeEstoque() {
        return quantidadeDeEstoque;
    }
}
