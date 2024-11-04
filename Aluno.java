public class Aluno {
    private final String nome;
    private final int idade;
    private final String faixa;
    private final double mensalidade;
    private final String dataNascimento;

    // Construtor
    public Aluno(String nome, int idade, String faixa, double mensalidade, String dataNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.faixa = faixa;
        this.mensalidade = mensalidade;
        this.dataNascimento = dataNascimento;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Outros getters, se necessários
    public int getIdade() {
        return idade;
    }

    public String getFaixa() {
        return faixa;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}
