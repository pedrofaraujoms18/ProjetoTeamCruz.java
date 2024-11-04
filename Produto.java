public class Produto {
    private final String nome;
    private int quantidadeEmEstoque;
    private final double preco;

    // Construtor
    public Produto(String nome, int quantidadeEmEstoque, double preco) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.preco = preco;
    }

    // Método para registrar uma venda
    public boolean registrarVenda(int quantidadeVendida) {
        if (quantidadeVendida <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidadeVendida;
            System.out.println("Venda realizada: " + quantidadeVendida + " unidade(s) de " + nome);
            return true;
        } else {
            System.out.println("Estoque insuficiente para o produto: " + nome);
            return false;
        }
    }

    // Getters, se necessários
    public String getNome() {
        return nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public double getPreco() {
        return preco;
    }

    // Setter, se necessário
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
