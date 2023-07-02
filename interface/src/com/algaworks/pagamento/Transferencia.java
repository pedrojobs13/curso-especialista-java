package com.algaworks.pagamento;

public class Transferencia implements MetodoPagamento {
    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.NaoPossuiContaBancaria()) {
            throw new RuntimeException("Não possui conta");
        }

        System.out.printf("Efetuando pix para %s no valor de %.2f, com a chave %s",
                beneficiario.getNome(),
                documento.getValorTotal(), beneficiario.getContaBancaria());
    }
}
