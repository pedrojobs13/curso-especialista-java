import com.algaworks.agencia.CadastroPacoteViagem;
import com.algaworks.agencia.PacoteViagem;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        CadastroPacoteViagem cadastroPacoteViagem = new CadastroPacoteViagem();
        cadastroPacoteViagem.adicionar("Pernambuco", 2010);
        cadastroPacoteViagem.adicionar("Maranhão", 3000);
        cadastroPacoteViagem.adicionar("Piauí", 1000);
        cadastroPacoteViagem.adicionar("Piauí", 5000);
        //0cadastroPacoteViagem.adicionar("Piauí", 1000);
        cadastroPacoteViagem.ordenarPorPrecoDecrescente();

        //cadastroPacoteViagem.removerPorDescricao("Piauí");

        imprimirPacotes(cadastroPacoteViagem.obterTodos());

        System.out.println(cadastroPacoteViagem.buscarPorDescricao("Piauí"));
    }

    private static void imprimirPacotes(List<PacoteViagem> pacotes) {
        for (PacoteViagem pacote : pacotes) {
            System.out.printf("%s -> preço: [%.2f]%n",
                    pacote.getDescricao(),
                    pacote.getPrecoPorPessoa());
        }
    }
}
