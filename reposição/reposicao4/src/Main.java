import java.util.Scanner;

void main() {
    Scanner scr = new Scanner(System.in);

    System.out.print("Digite a temperatura em Celsius: ");
    double celsius = scr.nextDouble();

    double fahrenheit = (celsius * 1.8) + 32;

    System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", fahrenheit);

}
