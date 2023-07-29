package com.algaworks.agencia;

import java.util.Objects;

public class PacoteViagem implements Comparable<PacoteViagem> {
    private String descricao;
    private double precoPorPessoa;

    public PacoteViagem(String descricao, double precoPorPessoa) {
        setDescricao(descricao);
        setPrecoPorPessoa(precoPorPessoa);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        Objects.requireNonNull(descricao);
        this.descricao = descricao;
    }

    public void setPrecoPorPessoa(double precoPorPessoa) {
        if (precoPorPessoa < 0) {
            throw new PrecoPorPessoaException("Preço por pessoa não pode ser negativo");
        }

        this.precoPorPessoa = precoPorPessoa;
    }

    public double getPrecoPorPessoa() {
        return precoPorPessoa;
    }


    @Override
    public int compareTo(PacoteViagem o) {
        return getDescricao().compareTo(o.getDescricao());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == null | getClass() != o.getClass()) return false;

        PacoteViagem pacoteViagem = (PacoteViagem) o;

        return descricao != null ? descricao.equals(pacoteViagem.descricao) : pacoteViagem.descricao == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao);
    }

    @Override
    public String toString() {
        return "PacoteViagem{" +
                "descricao='" + descricao + '\'' +
                ", precoPorPessoa=" + precoPorPessoa +
                '}';
    }
}
