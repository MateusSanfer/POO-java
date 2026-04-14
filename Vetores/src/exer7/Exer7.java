package exer7;

import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Lógica para ler "até 20 elementos"
        System.out.print("Quantos números você deseja digitar? (Máximo 20): ");
        int tamanho = sc.nextInt();

        // Proteção caso o usuário digite um valor fora do limite
        if (tamanho > 20) tamanho = 20;
        if (tamanho <= 0) tamanho = 1;

        int[] seq1 = new int[tamanho];
        int[] seq2 = new int[tamanho];

        System.out.println("\n--- Preenchendo a Sequência 1 ---");
        for (int i = 0; i < seq1.length; i++) {
            // Reaproveitando a SUA excelente lógica de validação do Exer 4!
            while (true) {
                System.out.print("Digite o elemento " + (i + 1) + " (apenas positivos): ");
                int valor = sc.nextInt();

                if (valor > 0) {
                    seq1[i] = valor;
                    break;
                } else {
                    System.out.println("Valor inválido! Digite um número maior que zero.");
                }
            }
        }

        // 2. Lógica para passar para o seq2 SEM REPETIÇÕES
        int elementosNoSeq2 = 0; // Vai controlar quantos números únicos já colocamos no seq2

        for (int i = 0; i < seq1.length; i++) {
            boolean jaExiste = false; // Bandeira igual a do Exer 6!

            // Varre o seq2 para ver se o número já está lá
            for (int j = 0; j < elementosNoSeq2; j++) {
                if (seq1[i] == seq2[j]) {
                    jaExiste = true; // Achou o número! Então ele é repetido.
                    break;
                }
            }

            // Se o número não existe no seq2, nós o adicionamos!
            if (!jaExiste) {
                seq2[elementosNoSeq2] = seq1[i];
                elementosNoSeq2++; // Aumenta a contagem de números únicos
            }
        }

        // 3. Imprimindo os resultados separadamente
        System.out.println("\n--- Sequência Original (SEQ1) ---");
        for (int i = 0; i < seq1.length; i++) {
            System.out.print(seq1[i] + " ");
        }

        System.out.println("\n\n--- Sequência Sem Repetições (SEQ2) ---");
        // O loop roda apenas até 'elementosNoSeq2' para não imprimir os zeros que sobraram no final do vetor
        for (int i = 0; i < elementosNoSeq2; i++) {
            System.out.print(seq2[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}