import exercicios.java.basico.lista1.Lista1;
import exercicios.java.basico.lista2.Lista2;
import exercicios.java.basico.lista3.Lista3;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;
            
            while (continuar) {
                System.out.println("\n===== MENU PRINCIPAL =====");
                System.out.println("1 - Lista Fundamentos da Linguagem de Programação Java");
                System.out.println("2 - Estruturas de Controle em Java");
                System.out.println("3 - Java e a Arte da Abstração com Classes e Encapsulamento");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1 -> Lista1.menu(scanner);
                    case 2 -> Lista2.menu(scanner);
                    case 3 -> Lista3.menu(scanner);
                    case 0 -> {
                        continuar = false;
                        System.out.println("Até mais!");
                    }
                    default -> System.out.println("Opção inválida.");
                }
            }
        }
    }
}