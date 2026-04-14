package exer5;

import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[] vert = new int[12];

    for (int i = 0; i < vert.length; i++) {
        System.out.println("Digite o " + (i + 1) + "º:");
        vert[i] = sc.nextInt();
    }

    int maior = vert[0];
    int menor = vert[0];

    int posMaior = 0;
    int posMenor = 0;

    for (int i = 1; i < vert.length; i++) {
        if(vert [i] > maior){
            maior= vert[i];
            posMaior = i; // Salva a posição em que encontrou o maior
        }if (vert [i] < menor){
            menor = vert[i];
            posMenor = i; // Salva a posição em que encontrou o menor
        }
    }

    for (int i = 0; i < vert.length; i++) {
        System.out.println("Índice " + i + " elemento: " + vert[i]);
    }
        System.out.println("\nMaior elemento: " + maior + " (encontrado no índice " + posMaior + ")");
        System.out.println("Menor elemento: " + menor + " (encontrado no índice " + posMenor + ")");
    sc.close();
    }
}
