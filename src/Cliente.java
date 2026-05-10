public class Cliente {
    private int codigo;
    private String nome;
    private String cpf;
    private String email;

    public Cliente(int codigo, String nome, String cpf, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Cliente{codigo=" + codigo + ", nome='" + nome + "', cpf='" + cpf + "', email='" + email + "'}";
    }
}