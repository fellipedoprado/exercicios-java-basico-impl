package exercicios.java.basico.lista2;

import java.util.Scanner;

public class AgeDifference {
    public static void executar(Scanner scanner) {
        scanner.nextLine(); // limpa buffer
        System.out.println("Nome da Pessoa 1:");
        String name1 = scanner.nextLine();
        System.out.println("Idade da Pessoa 1:");
        int age1 = scanner.nextInt();

        scanner.nextLine(); // limpa buffer novamente
        System.out.println("Nome da Pessoa 2:");
        String name2 = scanner.nextLine();
        System.out.println("Idade da Pessoa 2:");
        int age2 = scanner.nextInt();

        int ageDifference = Math.abs(age1 - age2);
        System.out.printf("A diferença de idade entre %s e %s é de %d anos.\n", name1, name2, ageDifference);
    }
}
