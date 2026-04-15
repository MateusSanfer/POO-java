package exer10;

import java.util.Arrays;
import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vertor =new int[5];

        for (int i = 0; i < vertor.length; i++) {
            System.out.println("Digite o " + (i + 1) +" valor: ");
            vertor[i] = sc.nextInt();
        }

        Arrays.sort(vertor);

        for (int ordem : vertor) {
            System.out.println(ordem);
        }
        sc.close();
    }

}
