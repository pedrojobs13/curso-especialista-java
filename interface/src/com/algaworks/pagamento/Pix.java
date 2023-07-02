package com.algaworks.pagamento;

public class Pix implements MetodoPagamento {
    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.NaoPossuiChavePix()) {
            throw new RuntimeException("Não possui chave");
        }

        System.out.printf("Efetuando pix para %s no valor de %.2f, com a chave %s", beneficiario.getNome(),
                documento.getValorTotal(), beneficiario.getChavePix());
    }

}
