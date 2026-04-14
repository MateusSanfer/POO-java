package exer6;

import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetore = new int[10];

        for (int i = 0; i < vetore.length; i++) {
            System.out.println("Digite o elemento " + (i + 1) + ":");
            vetore[i] = sc.nextInt();
        }
        System.out.println("Numero a verificar:");
        int n = sc.nextInt();

        boolean encontrou = false;

        for (int i = 0; i < vetore.length; i++) {
            if (vetore[i] == n) {
                System.out.println("Número " + n + " encontrado no índice: " + (i + 1));
                encontrou = true; // Avisamos que encontramos!
                break; // Achou? Então interrompe a busca.
            }
        }

        if(!encontrou) {
            System.out.println("Nenhum número encontrado");
        }
        sc.close();
    }
}
