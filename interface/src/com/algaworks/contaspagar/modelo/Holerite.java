package com.algaworks.contaspagar.modelo;

import com.algaworks.pagamento.Beneficiario;
import com.algaworks.pagamento.DocumentoPagavel;

public class Holerite implements DocumentoPagavel {
    private double valorHora;
    private int quantidadeHoras;
    private Beneficiario funcionario;

    public Holerite(double valorHora, int quantidadeHoras, Beneficiario funcionario) {
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
        this.funcionario = funcionario;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public Beneficiario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Beneficiario funcionario) {
        this.funcionario = funcionario;
    }


    @Override
    public double getValorTotal() {
        return getValorHora() * getQuantidadeHoras();
    }

    @Override
    public Beneficiario getBeneficiario() {
        return getFuncionario();
    }
}
