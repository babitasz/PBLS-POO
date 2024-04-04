import java.util.Scanner;

public class Menu {
    private int opcao;
    Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        int opcao;

        do {
            System.out.println("Bem-vindo ao NETFLIX");
            System.out.println("Escolha uma opção:");
            System.out.println("1- CADASTRAR USUÁRIO");
            System.out.println("2- ASSISTIR FILME");
            System.out.println("3- ADICIONAR MIDIA AOS FAVORITOS");
            System.out.println("4- ASSISTIR SÉRIE");
            System.out.println("5- LISTAR FILMES");
            System.out.println("6- LISTAR SÉRIES");
            System.out.println("0- SAIR");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    Cliente.cadastrarNovoUsuario();
                    break;
                case 2:
                    Midia.assistirFilme();
                    break;
                case 3:
                    Midia.adicionarFavoritos();
                    break;
                case 4:
                    Serie.assistirSerie();
                    break;
                case 5:
                    Midia.listarFilmesDisponiveis();
                    break;
                case 6:
                    Serie.listarSeriesDisponiveis();
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }}