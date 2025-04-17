package exercicios.java.basico.lista2;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Hello {
    public static void executar(Scanner scanner) {
        int baseYear = OffsetDateTime.now().getYear();

        System.out.println("Qual o seu nome?");
        scanner.nextLine(); // Limpa buffer
        String name = scanner.nextLine();

        System.out.println("Qual o seu ano de nascimento?");
        int year = scanner.nextInt();

        int age = baseYear - year;
        System.out.printf("Olá %s, você tem %d anos.\n", name, age);
    }
}