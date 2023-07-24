package com.algaworks.estoque;

public class GerenciadorEstoque<E>{
    private int quantidadeTotal;

    public void adicionar(Estocavel estocavel) {
        quantidadeTotal += estocavel.getQuantidadeDeEstoque();
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }



}
