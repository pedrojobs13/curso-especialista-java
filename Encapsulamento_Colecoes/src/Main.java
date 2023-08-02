import com.algaworks.comercial.Cliente;
import com.algaworks.comercial.ItemVenda;
import com.algaworks.comercial.LimiteDeCompraExcedidoException;
import com.algaworks.comercial.Venda;

public class Main {
    public static void main(String[] args) {
        Venda venda = new Venda(new Cliente("Joe", 2000));


        venda.adicionarItem(new ItemVenda("Magic mouse", 700));
        venda.adicionarItem(new ItemVenda("Adaptador USB", 400));
        venda.adicionarItem(new ItemVenda("Mackook Pro", 15000));

        for (ItemVenda list: venda.getItens()){
            System.out.printf("%.2f%n", list.getValor());
        }


    }
}