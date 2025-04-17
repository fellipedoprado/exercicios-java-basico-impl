package exercicios.java.basico.lista3;

import java.util.Scanner;


public class Lista3 {
    public static void menu(Scanner scanner) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Lista 3 ---");
            System.out.println("1 - Atividade1");
            System.out.println("2 - Atividade2");
            System.out.println("3 - Atividade3");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    // TODO: Exercicio 1
                }
                break;
                case 2: {
                    // TODO: Exercicio 2
                }
                break;
                case 3: {
                    // TODO: Exercicio 3
                }
                break;
                case 0: {
                    continuar = false;
                }
                break;
                default: {
                    System.out.println("Opção inválida.");
                }
                break;
            }
        }
    }
}
