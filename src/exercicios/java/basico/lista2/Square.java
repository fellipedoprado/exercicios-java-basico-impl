package exercicios.java.basico.lista2;

import java.util.Scanner;

public class Square {
    public static void executar(Scanner scanner) {
        System.out.println("Qual é o tamanho do lado do quadrado?");
        int lado = scanner.nextInt();
        int area = lado * lado;
        System.out.printf("A área do quadrado de lado %d é igual a %d.\n", lado, area);
    }
}