/*
    Solved By Rutton Chandra Sarker
    North South University
*/

import java.util.*;

public class MakingAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        StringBuilder m = new StringBuilder(a);
        StringBuilder s = new StringBuilder(b);
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    count++;
                    s.setCharAt(j, '0');
                    m.setCharAt(i, '0');
                    b = s.toString();
                    a = m.toString();
                    break;
                }
            }
        }
        System.out.println((a.length() - count) + (b.length() - count));
        sc.close();
    }
}