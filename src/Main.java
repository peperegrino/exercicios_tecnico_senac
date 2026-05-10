import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Notebook", 3500.00, 10);
        Cliente cliente = new Cliente(1, "Joao Silva", "123.456.789-00", "joao@email.com");
        Pedido pedido = new Pedido(1001, new Date(), produto.getPreco(), cliente, produto);

        System.out.println(produto);
        System.out.println(cliente);
        System.out.println(pedido);
    }
}