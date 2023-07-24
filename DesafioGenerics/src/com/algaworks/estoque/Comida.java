package com.algaworks.estoque;

import java.util.Objects;

public class Comida {
    private String nome;
    private int quantidadeDeEstoque;

    public Comida(String modelo, int quantidadeDeEstoque) {
        Objects.requireNonNull("Não pode ser nulo", modelo);
        this.nome = modelo;
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeDeEstoque(int quantidadeDeEstoque) {
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }
}
