public class Frequencia {
    private final Aluno aluno;
    private final String data;

    // Construtor
    public Frequencia(Aluno aluno, String data) {
        this.aluno = aluno;
        this.data = data;
    }

    // Método para exibir informações da frequência
    public void exibirInformacoes() {
        System.out.println("Aluno: " + aluno.getNome() + ", Data: " + data);
    }

    // Getters, se necessários
    public Aluno getAluno() {
        return aluno;
    }

    public String getData() {
        return data;
    }
}
