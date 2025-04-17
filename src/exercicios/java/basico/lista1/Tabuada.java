package exercicios.java.basico.lista1;

import java.util.Scanner;

public class Tabuada {
    public static void executar(Scanner scanner) {
        System.out.println("Digite um número para gerar a tabuada:");
        int numero = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", numero, i, numero * i);
        }
    }
}
