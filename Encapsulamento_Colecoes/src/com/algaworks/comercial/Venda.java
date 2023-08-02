package com.algaworks.comercial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venda {
    private double somaVenda;
    private Cliente cliente;
    private List<ItemVenda> itens = new ArrayList<>();

    public Venda(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void adicionarItem(ItemVenda item){
        if(isLimiteAlcacado(item)){
            throw new LimiteDeCompraExcedidoException("Limite de compra alcaçado");
        }
        somaVenda += item.getValor();
        itens.add(item);
    }

    public double getSomaVenda(){
        return somaVenda;
    }

    public List<ItemVenda> getItens(){
        return new ArrayList<>(itens);
    }

    private boolean isLimiteAlcacado(ItemVenda item){
        return getSomaVenda() + item.getValor() > getCliente().getLimiteCompras();
    }

}
