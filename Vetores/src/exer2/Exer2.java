package exer2;

import java.util.Scanner;

public class Exer2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int[] a = new int[8];
    int[] b = new int[8];
    int[] c = new int[8];

    for (int i = 0; i < a.length; i++) {
        System.out.println("Digite o elemento A " + (i + 1) + ":");
        a[i] = sc.nextInt();
        System.out.println("Digite o elemento B " + (i + 1) + ":");
        b[i] = sc.nextInt();
        c[i] = a[i] + b[i];
    }

    System.out.println("Vetor C (soma):");
    for (int valor : c) {
        System.out.print(valor + " ");
    }

    // impressão em formato de tabela
    System.out.println("\nTabela de resultados:");
    System.out.println("A\tB\tC");
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i] + "\t" + b[i] + "\t" + c[i]);
    }

    sc.close();
    }
}
