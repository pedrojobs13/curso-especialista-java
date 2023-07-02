package com.algaworks.pagamento;

import java.util.Objects;

public class Beneficiario {
    private String nome;
    private String chavePix;
    private String contaBancaria;


    public Beneficiario(String nome, String chavePix, String contaBancaria) {
        setNome(nome);
        setChavePix(chavePix);
        setContaBancaria(contaBancaria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public boolean NaoPossuiContaBancaria() {
        return getContaBancaria() == null && getContaBancaria().isEmpty();
    }

    public boolean NaoPossuiChavePix() {
        return getChavePix() == null && getChavePix().isEmpty();
    }

}
