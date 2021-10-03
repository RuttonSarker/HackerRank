/*
    Solved By Rutton Chandra Sarker
    North South University
 */

import java.util.*;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int k = sc.nextInt();
        char b = '\0';
        int ascii = 0, value = 0;

        for (int i = 0; i < a; i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                ascii = s.charAt(i) + k;
                if (ascii > 90) {
                    value = s.charAt(i) - a;
                    ascii = ((ascii + value) % 26) + 65;
                    b = (char) ascii;
                } else {
                    b = (char) ascii;
                }
            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                ascii = s.charAt(i) + k;
                if (ascii > 122) {
                    value = s.charAt(i) - a;
                    ascii = ((ascii + value) % 26) + 97;
                    b = (char) ascii;
                } else {
                    b = (char) ascii;
                }
            } else {
                ascii = s.charAt(i);
                b = (char) ascii;
            }
            System.out.print(b + "");
        }
    }
}