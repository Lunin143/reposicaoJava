import java.util.Scanner;

void main() {

    Scanner scr = new Scanner(System.in);

    double dolar = 5.17;
    double euro = 5.97;

    System.out.println("=== CONVERSOR DE MOEDAS ===");
    System.out.println("1 - Dólar para Real");
    System.out.println("2 - Euro para Real");
    System.out.println("3 - Real para Dólar");
    System.out.println("4 - Real para Euro");
    System.out.println("5 - Dólar para Euro");
    System.out.println("6 - Euro para Dólar");
    System.out.print("Escolha uma opção: ");

    int opcao = scr.nextInt();

    System.out.print("Digite o valor: ");
    double valor = scr.nextDouble();

    double resultado;

    switch (opcao) {
        case 1:
            resultado = valor * dolar;
            System.out.printf("R$ %.2f%n", resultado);
            break;

        case 2:
            resultado = valor * euro;
            System.out.printf("R$ %.2f%n", resultado);
            break;

        case 3:
            resultado = valor / dolar;
            System.out.printf("US$ %.2f%n", resultado);
            break;

        case 4:
            resultado = valor / euro;
            System.out.printf("€ %.2f%n", resultado);
            break;

        case 5:
            resultado = (valor * dolar) / euro;
            System.out.printf("€ %.2f%n", resultado);
            break;

        case 6:
            resultado = (valor * euro) / dolar;
            System.out.printf("US$ %.2f%n", resultado);
            break;

        default:
            System.out.println("Opção inválida!");
    }
}