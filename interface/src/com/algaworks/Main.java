package com.algaworks;

import com.algaworks.contaspagar.modelo.Holerite;
import com.algaworks.contaspagar.modelo.OrdemServico;
import com.algaworks.contaspagar.servico.ServicoContaPagar;
import com.algaworks.pagamento.Beneficiario;
import com.algaworks.pagamento.DocumentoPagavel;
import com.algaworks.pagamento.Pix;

public class Main {
    public static void main(String[] args){
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(new Pix());

        Beneficiario funcionario = new Beneficiario("Joe", "12346", "456");
        DocumentoPagavel documentoPagavel = new Holerite(100, 168, funcionario);


        Beneficiario fornecedor = new Beneficiario("XYZ", "123456", "452");
        DocumentoPagavel os = new OrdemServico(fornecedor, 65_500);

        servicoContaPagar.pagar(documentoPagavel);
        servicoContaPagar.pagar(os);
    }

}
