package exercicios.java.basico.lista1;

import java.util.Scanner;

public class ParImpar {
    public static void executar(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int segundo = scanner.nextInt();

        while (segundo <= primeiro) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
            System.out.print("Digite o segundo número novamente: ");
            segundo = scanner.nextInt();
        }

        System.out.print("Deseja ver números 'par' ou 'impar'? ");
        String opcao = scanner.next().toLowerCase();

        while (!opcao.equals("par") && !opcao.equals("impar")) {
            System.out.print("Opção inválida. Digite 'par' ou 'impar': ");
            opcao = scanner.next().toLowerCase();
        }

        System.out.println("\nNúmeros " + opcao + " entre " + primeiro + " e " + segundo + " (ordem decrescente):");

        for (int i = segundo; i >= primeiro; i--) {
            if (opcao.equals("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (opcao.equals("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
