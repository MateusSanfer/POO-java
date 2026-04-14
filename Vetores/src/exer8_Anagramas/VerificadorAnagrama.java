package exer8_Anagramas;

import java.util.Arrays;

public class VerificadorAnagrama {
    public static boolean isAnagrama(String a, String b) {
        String  str1 = a.replaceAll("\\s", "").toLowerCase();
        String  str2 = b.replaceAll("\\s", "").toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args) {
        System.out.println(isAnagrama("Amor", "Roma")); // true
        System.out.println(isAnagrama("Ola", "Allo"));   // false
    }
}
