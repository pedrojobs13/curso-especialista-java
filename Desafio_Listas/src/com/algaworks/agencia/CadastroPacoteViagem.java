package com.algaworks.agencia;

import java.util.*;

public class CadastroPacoteViagem {
    private List<PacoteViagem> pacoteViagemsList = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        if (pacoteViagemsList.contains(pacoteViagemsList)) {
            throw new IllegalStateException("Não pode inserir termos parecidos");
        }
        pacoteViagemsList.add(new PacoteViagem(descricao, precoDiaria));
    }

    public List<PacoteViagem> obterTodos() {
        return pacoteViagemsList;
    }

    public void ordenar() {
        // preciso implementar o compareTo
        Collections.sort(pacoteViagemsList);
    }

    public void ordenarPorPrecoDecrescente() {
        pacoteViagemsList.sort(new PrecoViagemComparator().
                thenComparing(Comparator.naturalOrder()));
    }

    public void removerPorDescricao(String descricao) {
        Iterator<PacoteViagem> pacoteViagemIterator = pacoteViagemsList.listIterator();
        List<PacoteViagem> elementToDelete = new ArrayList<>();

        while (pacoteViagemIterator.hasNext()) {
            PacoteViagem element = pacoteViagemIterator.next();
            if (element.getDescricao().equals(descricao)) {
                elementToDelete.add(element);
            }
        }
        if (elementToDelete.isEmpty()) {
            throw new IllegalStateException("Nenhum termo encontrado com essa descrição");
        }
        pacoteViagemsList.removeAll(elementToDelete);

    }

    public PacoteViagem buscarPorDescricao(String descricao) {

        for (PacoteViagem pacoteViagem : pacoteViagemsList) {
            if (pacoteViagem.getDescricao().equals(descricao)) {
                return pacoteViagem;
            }
        }
        throw new IllegalStateException("Nenhum pacote encontrado com essa descrição");
    }
}
