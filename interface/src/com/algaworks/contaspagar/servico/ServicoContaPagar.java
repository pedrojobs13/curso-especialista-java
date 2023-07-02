package com.algaworks.contaspagar.servico;

import com.algaworks.pagamento.DocumentoPagavel;
import com.algaworks.pagamento.MetodoPagamento;
import com.algaworks.pagamento.Transferencia;


public class ServicoContaPagar {
    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {


        metodoPagamento.pagar(documento);
    }
}
