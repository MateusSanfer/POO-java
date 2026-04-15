package exer9;

import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20]; // A união pode ter até 20 elementos no total
        int[] d = new int[10];

        int qtdA = 0;
        int qtdB = 0;

        // --- PREENCHENDO VETOR A ---
        System.out.println("--- Preenchendo a Sequência 1 (Vetor A) ---");
        for (int i = 0; i < a.length; i++) {
            int valor = 0;
            while (true) {
                System.out.print("Digite o elemento " + (i + 1) + " (apenas positivos ou 999 para parar): ");
                valor = sc.nextInt();

                if (valor == 999) {
                    break;
                } else if (valor > 0) {
                    boolean jaExiste = false;
                    for (int j = 0; j < qtdA; j++) {
                        if (a[j] == valor) {
                            jaExiste = true;
                            break;
                        }
                    }

                    if (jaExiste) {
                        System.out.println("Número repetido! Você já digitou esse valor no Vetor A.");
                    } else {
                        a[qtdA] = valor;
                        qtdA++;
                        break;
                    }
                } else {
                    System.out.println("Valor inválido! Digite um número maior que zero.");
                }
            }
            if (valor == 999) break;
        }

        // --- PREENCHENDO VETOR B ---
        System.out.println("\n--- Preenchendo a Sequência 2 (Vetor B) ---");
        for (int i = 0; i < b.length; i++) {
            int valor = 0;
            while (true) {
                System.out.print("Digite o elemento " + (i + 1) + " (apenas positivos ou 999 para parar): ");
                valor = sc.nextInt();

                if (valor == 999) {
                    break;
                } else if (valor > 0) {
                    boolean jaExiste = false;
                    for (int j = 0; j < qtdB; j++) {
                        if (b[j] == valor) {
                            jaExiste = true;
                            break;
                        }
                    }

                    if (jaExiste) {
                        System.out.println("Número repetido! Você já digitou esse valor no Vetor B.");
                    } else {
                        b[qtdB] = valor;
                        qtdB++;
                        break;
                    }
                } else {
                    System.out.println("Valor inválido! Digite um número maior que zero.");
                }
            }
            if (valor == 999) break;
        }

        // --- VETOR C (A UNIÃO B) ---
        int qtdC = 0;

        // 1. Copia tudo do A para o C
        for (int i = 0; i < qtdA; i++) {
            c[qtdC] = a[i];
            qtdC++;
        }

        // 2. Tenta adicionar os do B, verificando se já não estão no C
        for (int i = 0; i < qtdB; i++) {
            boolean jaExiste = false;
            for (int j = 0; j < qtdC; j++) {
                if (b[i] == c[j]) {
                    jaExiste = true;
                    break;
                }
            }
            if (!jaExiste) {
                c[qtdC] = b[i];
                qtdC++;
            }
        }

        // --- VETOR D (A COMPLEMENTAR B) ---
        int qtdD = 0;
        for (int i = 0; i < qtdA; i++) {
            boolean achouNoB = false;
            for (int j = 0; j < qtdB; j++) {
                if (a[i] == b[j]) {
                    achouNoB = true;
                    break;
                }
            }
            if (!achouNoB) {
                d[qtdD] = a[i];
                qtdD++;
            }
        }

        // --- IMPRESSÃO DOS RESULTADOS ---
        System.out.println("\n==================================");
        System.out.print("Vetor A: ");
        for (int i = 0; i < qtdA; i++) System.out.print(a[i] + " ");

        System.out.print("\nVetor B: ");
        for (int i = 0; i < qtdB; i++) System.out.print(b[i] + " ");

        System.out.print("\n\nVetor C (União): ");
        for (int i = 0; i < qtdC; i++) System.out.print(c[i] + " ");

        System.out.print("\nVetor D (A - B): ");
        for (int i = 0; i < qtdD; i++) System.out.print(d[i] + " ");
        System.out.println("\n==================================");

        sc.close();
    }
}