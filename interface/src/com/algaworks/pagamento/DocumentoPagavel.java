package com.algaworks.pagamento;

public interface DocumentoPagavel {
    double getValorTotal();
    public abstract Beneficiario getBeneficiario();
}
