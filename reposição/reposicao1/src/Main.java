
import java.util.Scanner;
import operadores.operadores;

void main() {
    Scanner scr = new Scanner(System.in);
    operadores op = new operadores();

    System.out.print("Insira o primeiro valor: ");
    op.valor1 = scr.nextDouble();

    System.out.print("Insira o segundo valor: ");
    op.valor2 = scr.nextDouble();

    System.out.println("Escolha a operação que deseja realizar: \n 1- Adição\n 2- Subtração\n 3- Divisão\n 4- Multiplicação");

    int escolha = scr.nextInt();
    switch (escolha) {
        case 1:
            System.out.println("O resultado é: " + op.adicao());
            break;

        case 2:
            System.out.println("O resultado é: " + op.subtracao());
            break;

        case 3:
            System.out.println("O resultado é: " + op.divisao());
            break;

        case 4:
            System.out.println("O resultado é: " + op.multiplicacao());
            break;
    }
}
