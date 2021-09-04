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
        String s[] = new String[a];

        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine();
        }
        sc.close();
    }
}
