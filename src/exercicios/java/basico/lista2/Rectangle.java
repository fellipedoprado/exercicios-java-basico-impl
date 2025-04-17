package exercicios.java.basico.lista2;

import java.util.Scanner;

public class Rectangle {
    public static void executar(Scanner scanner) {
        System.out.println("Qual é o tamanho da base do retângulo?");
        int base = scanner.nextInt();

        System.out.println("Qual é a altura do retângulo?");
        int altura = scanner.nextInt();

        int area = base * altura;
        System.out.printf("A área do retângulo com base %d e altura %d é igual a %d.\n", base, altura, area);
    }
}
