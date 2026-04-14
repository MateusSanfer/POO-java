package exer3;

import java.util.Scanner;

public class Exer3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o elemento " + (i + 1) + ":");
            vetor[i] = sc.nextInt();
        }

        // verificação dos índices dos elementos ímpares
        System.out.println("\nÍndices dos elementos ímpares:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.println("Índice " + i + " -> valor " + vetor[i]);
            }
        }

        sc.close();
    }
}
