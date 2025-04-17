package exercicios.java.basico.lista2;

import java.util.Scanner;

public class Lista2 {

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Lista 2 ---");
            System.out.println("1 - Saudação com idade");
            System.out.println("2 - Área do Quadrado");
            System.out.println("3 - Área do Retângulo");
            System.out.println("4 - Diferença de Idade");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 ->
                    Hello.executar(scanner);
                case 2 ->
                    Square.executar(scanner);
                case 3 ->
                    Rectangle.executar(scanner);
                case 4 ->
                    AgeDifference.executar(scanner);
                case 0 ->
                    continuar = false;
                default ->
                    System.out.println("Opção inválida.");
            }
        }
    }
}
