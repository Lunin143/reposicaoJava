import java.util.ArrayList;
import java.util.Scanner;
import construtor.Pessoa;

void main() {

        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {

            System.out.println("Cadastro da pessoa " + i);

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            pessoas.add(new Pessoa(nome, idade));
        }

        System.out.println("    PARTICIPANTES CADASTRADOS    ");

        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println((i + 1) + "- " + pessoas.get(i));
        }
}
