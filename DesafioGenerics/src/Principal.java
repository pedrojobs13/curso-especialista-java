import com.algaworks.estoque.*;

public class Principal {
    public static void main(String[] args) {
        GerenciadorEstoque<Carro> gerenciadorEstoqueCarro = new GerenciadorEstoque<>();
        GerenciadorEstoque<Roupa> gerenciadorEstoqueRoupa = new GerenciadorEstoque<>();
        GerenciadorEstoque<Comida> gerenciadorEstoque = new GerenciadorEstoque<>();



        gerenciadorEstoqueCarro.adicionar(new Carro("Bmw", 10));
        gerenciadorEstoqueCarro.adicionar(new Carro("Toyota", 22));
        imprimirEstoque(gerenciadorEstoqueCarro);

        gerenciadorEstoqueRoupa.adicionar(new Roupa("Camiseta básica branca", 20));
        gerenciadorEstoqueRoupa.adicionar(new Roupa("Camiseta básica preta", 10));
        imprimirEstoque(gerenciadorEstoqueRoupa);
    }
    
    private static void imprimirEstoque(GerenciadorEstoque<? extends Estocavel> gerenciadorEstoque) {

        System.out.println("Estoque : " + gerenciadorEstoque.getQuantidadeTotal());
    }
}
