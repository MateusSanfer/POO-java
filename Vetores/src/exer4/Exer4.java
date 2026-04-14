package exer4;

import java.util.Scanner;

public class Exer4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[vet1.length + vet2.length];

        for (int i = 0; i < vet1.length; i++) {
            while (true) {
                System.out.println("Digite o elemento " + (i + 1) + " VET1 :");
                int valor = sc.nextInt();
                if (i == 0 || valor > vet1[i - 1]){
                    vet1[i] = valor;
                    break;
                }else{
                    System.out.println("Valor inválido! Digite um número maior que " + vet1[i - 1]);
                }
            }
        }

        for (int i = 0; i < vet2.length; i++) {
            while (true) {
                System.out.print("Digite o elemento " + (i + 1) + " de VET2: ");
                int valor = sc.nextInt();
                if (i == 0 || valor > vet2[i - 1]) {
                    vet2[i] = valor;
                    break;
                } else {
                    System.out.println("Valor inválido! Digite um número maior que " + vet2[i - 1]);
                }
            }
        }
        // intercalação
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < vet1.length && j < vet2.length) {

            if (vet1[i] <= vet2[j]) {
                vet3[k++] = vet1[i++];
            } else {
                vet3[k++] = vet2[j++];
            }
        }

        // Se um dos vetores acabar antes do outro, copiamos o restante do que sobrou
        while (i < vet1.length) {
            vet3[k++] = vet1[i++];
        }
        while (j < vet2.length) {
            vet3[k++] = vet2[j++];
        }

        System.out.println("\nVetor em ordem crescente:");
        for (int v : vet3) {
            System.out.print(v + " ");
        }
        sc.close();
    }
}
