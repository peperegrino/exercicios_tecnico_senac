import java.util.Date;

public class Pedido {

        private int numeroPedido;
        private Date dataDaCompra;
        private Double valorTotal;
        private Cliente cliente;
        private Produto produto;

        public Pedido(int numeroPedido, Date dataDaCompra, Double valorTotal, Cliente cliente, Produto produto) {
            this.numeroPedido = numeroPedido;
            this.dataDaCompra = dataDaCompra;
            this.valorTotal = valorTotal;
            this.cliente = cliente;
            this.produto = produto;
        }

        public int getNumeroPedido() { return numeroPedido; }
        public Date getDataDaCompra() { return dataDaCompra; }
        public Double getValorTotal() { return valorTotal; }
        public Cliente getCliente() { return cliente; }
        public Produto getProduto() { return produto; }

        @Override
        public String toString() {
            return "Pedido{numero=" + numeroPedido + ", data=" + dataDaCompra +
                    ", total=R$" + valorTotal + ", cliente=" + cliente.getNome() +
                    ", produto=" + produto.getNome() + "}";
        }
    }

