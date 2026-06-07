import objeto.Produto;
import java.util.ArrayList;
import java.util.Scanner;

void main() {

        Scanner scr = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = scr.nextInt();
            scr.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = scr.nextLine();

                    System.out.print("Quantidade: ");
                    int qnt = scr.nextInt();

                    System.out.print("Preço: ");
                    double preco = scr.nextDouble();
                    scr.nextLine();

                    Produto produto = new Produto(nome, qnt, preco);
                    produtos.add(produto);

                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("   PRODUTOS CADASTRADOS");

                        for (Produto p : produtos) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);
}
