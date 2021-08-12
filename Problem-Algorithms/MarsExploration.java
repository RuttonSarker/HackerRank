/*
    Solved By Rutton Chandra Sarker
    North South University
 */

import java.util.*;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String m = "SOS";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != m.charAt(i % 3)) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
