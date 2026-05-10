public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(int codigo, String nome, double preco, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public Double getPreco() { return preco; }
    public int getQuantidadeEmEstoque() { return quantidadeEmEstoque; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setQuantidadeEmEstoque(int qtd) { this.quantidadeEmEstoque = qtd; }

    @Override
    public String toString() {
        return "Produto{codigo=" + codigo + ", nome='" + nome + "', preco=" + preco + ", estoque=" + quantidadeEmEstoque + "}";
    }
}