import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Estado sp = new Estado("SP", "São Paulo");
        Estado ce = new Estado("CE", "Ceará");
        Estado mg = new Estado("MG", "Minas Gerais");
        Estado ro = new Estado("RO", "Rondônia");

        Cidade saoPaulo = new Cidade(3550308, "São Paulo", 2_000_000);
        Cidade beloHorizonte = new Cidade(3106200, "Belo Horizonte", 700_000);
        Cidade fortaleza = new Cidade(2304400, "Fortaleza", 200_000);
        Cidade portoVelho = new Cidade(1100205, "Porto Velho", 100_000);

        // TODO PERFORMACE É O MAIS IMPORTANTE SEM ORDEM
//        Map<Estado, Cidade> capitais = new HashMap<>();

        // TODO ORDEM DE INSERÇÃO
        //Map<Estado, Cidade> capitais = new LinkedHashMap<>();

        // TODO ORDEM NATURAL DAS CHAVES
        Map<Estado, Cidade> capitais = new TreeMap<>();

        capitais.put(sp, saoPaulo);
        capitais.put(mg, beloHorizonte);
        capitais.put(ce, fortaleza);
        capitais.put(ro, portoVelho);


        for(Map.Entry<Estado, Cidade> entry: capitais.entrySet()){
            System.out.printf("Cód IBGE [%d] Estado de %s Capital -> %s %n",
                    entry.getValue().getCodigoIbge(),
                    entry.getKey().getNome(),
                    entry.getValue().getNome()
                    );
        }
    }
}