import java.util.ArrayList;
import java.util.Scanner;

public class  SistemaAcademia {
    private final ArrayList<Aluno> alunos;
    private final ArrayList<Produto> produtos;
    private final ArrayList<Frequencia> presencas;

    public SistemaAcademia() {
        alunos = new ArrayList<>();
        produtos = new ArrayList<>();
        presencas = new ArrayList<>();
    }

    public void exibirMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;
            do {
                System.out.println("===== MENU =====");
                System.out.println("1. Cadastrar Aluno");
                System.out.println("2. Registrar Frequência");
                System.out.println("3. Registrar Pagamento");
                System.out.println("4. Registrar Venda de Produto");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                switch (opcao) {
                    case 1 -> cadastrarAluno(scanner);
                    case 2 -> registrarFrequencia(scanner);
                    case 3 -> registrarPagamento(scanner);
                    case 4 -> registrarVendaProduto(scanner);
                    case 5 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 5);
        }
    }

    private void cadastrarAluno(Scanner scanner) {
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Idade do aluno: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Faixa do aluno: ");
        String faixa = scanner.nextLine();
        System.out.print("Mensalidade do aluno: ");
        double mensalidade = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Data de Nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        Aluno aluno = new Aluno(nome, idade, faixa, mensalidade, dataNascimento);
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso.");
    }

    private void registrarFrequencia(Scanner scanner) {
        System.out.print("Nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                System.out.print("Data da presença (dd/mm/aaaa): ");
                String data = scanner.nextLine();
                Frequencia frequencia = new Frequencia(aluno, data);
                presencas.add(frequencia);
                System.out.println("Frequência registrada.");
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    private void registrarPagamento(Scanner scanner) {
        System.out.print("Nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                System.out.print("Valor do pagamento: ");
                double valor = scanner.nextDouble();
                Pagamento pagamento = new Pagamento(aluno, valor);
                pagamento.exibirInformacoes();
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    private void registrarVendaProduto(Scanner scanner) {
        System.out.print("Nome do produto: ");
        String nomeProduto = scanner.nextLine();
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                System.out.print("Quantidade vendida: ");
                int quantidade = scanner.nextInt();
                if (produto.registrarVenda(quantidade)) {
                    System.out.println("Venda registrada.");
                } else {
                    System.out.println("Estoque insuficiente.");
                }
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
