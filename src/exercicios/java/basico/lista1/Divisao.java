package exercicios.java.basico.lista1;

import java.util.Scanner;

public class Divisao {
    public static void executar(Scanner scanner) {
        System.out.println("Digite um número:");
        int number = scanner.nextInt();

        while (true) {
            System.out.println("Digite outro número:");
            int number2 = scanner.nextInt();

            if (number2 < number) {
                System.out.printf("Número menor que %d, tente novamente.\n", number);
                continue;
            }

            if (number2 % number != 0) {
                System.out.printf("Número %d %% %d = %d, encerrando o programa.\n", number2, number, number2 % number);
                break;
            }
        }
    }
}
