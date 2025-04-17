package exercicios.java.basico.lista1;

import java.util.Scanner;

public class Lista1 {

    public static void menu(Scanner scanner) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Lista 1 ---");
            System.out.println("1 - Tabuada");
            System.out.println("2 - IMC");
            System.out.println("3 - Par ou Ímpar");
            System.out.println("4 - Divisão");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 ->
                    Tabuada.executar(scanner);
                case 2 ->
                    IMC.executar(scanner);
                case 3 ->
                    ParImpar.executar(scanner);
                case 4 ->
                    Divisao.executar(scanner);
                case 0 ->
                    continuar = false;
                default ->
                    System.out.println("Opção inválida.");
            }
        }
    }
}
