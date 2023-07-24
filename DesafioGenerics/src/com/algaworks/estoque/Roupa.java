package com.algaworks.estoque;

import java.util.Objects;

public class Roupa implements Estocavel {
    private String descricao;
    private int quantidadeDeEstoque;

    public Roupa(String descricao, int quantidadeDeEstoque) {
        Objects.requireNonNull("Não pode ser nulo", descricao);

        this.descricao = descricao;
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidadeDeEstoque(int quantidadeDeEstoque) {
        this.quantidadeDeEstoque = quantidadeDeEstoque;
    }

    @Override
    public int getQuantidadeDeEstoque() {
        return quantidadeDeEstoque;
    }
}

