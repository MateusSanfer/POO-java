package exer8_Anagramas;

import java.util.Arrays;
import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Verificador de Anagramas ---");

        // 1. Lendo a primeira palavra com validação
        String palavra1;
        while (true) {
            System.out.print("Digite a 1ª palavra (até 10 letras): ");
            palavra1 = sc.nextLine();

            if (palavra1.length() <= 10 && !palavra1.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Inválido! Digite uma palavra com no máximo 10 caracteres.");
            }
        }

        // 2. Lendo a segunda palavra com a sua validação
        String palavra2;
        while (true) {
            System.out.print("Digite a 2ª palavra (até 10 letras): ");
            palavra2 = sc.nextLine();

            if (palavra2.length() <= 10 && !palavra2.trim().isEmpty()) {
                break;
            } else {
                System.out.println("Inválido! Digite uma palavra com no máximo 10 caracteres.");
            }
        }

        // 3. Tratamento: removendo espaços e passando para maiúsculo (para o Java entender que 'A' e 'a' são iguais)
        String tratada1 = palavra1.replaceAll("\\s", "").toUpperCase();
        String tratada2 = palavra2.replaceAll("\\s", "").toUpperCase();

        // 4. Lógica do Anagrama
        // Regra A: Se o tamanho das palavras tratadas for diferente, já sabemos que não é anagrama
        if (tratada1.length() != tratada2.length()) {
            System.out.println("\n'" + palavra1 + "' e '" + palavra2 + "' NÃO são anagramas.");
        } else {
            // Regra B: Transformar as palavras em vetores de caracteres e ordenar em ordem alfabética
            char[] array1 = tratada1.toCharArray();
            char[] array2 = tratada2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            // Regra C: Se, após organizar em ordem alfabética, os vetores forem iguais, é anagrama!
            if (Arrays.equals(array1, array2)) {
                System.out.println("\nBINGO! '" + palavra1 + "' e '" + palavra2 + "' SÃO anagramas.");
            } else {
                System.out.println("\n'" + palavra1 + "' e '" + palavra2 + "' NÃO são anagramas.");
            }
        }

        sc.close();
    }
}