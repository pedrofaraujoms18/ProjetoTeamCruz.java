public class Pagamento {
    private final Aluno aluno;
    private final double valorPago;

    // Construtor
    public Pagamento(Aluno aluno, double valorPago) {
        this.aluno = aluno;
        this.valorPago = valorPago;
    }

    // Método para exibir informações do pagamento
    public void exibirInformacoes() {
        System.out.println("Pagamento registrado para " + aluno.getNome() + ". Valor: R$" + valorPago);
    }

    // Getters, se necessários
    public Aluno getAluno() {
        return aluno;
    }

    public double getValorPago() {
        return valorPago;
    }
}
