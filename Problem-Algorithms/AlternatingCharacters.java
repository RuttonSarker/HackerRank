
/*
    Solved By Rutton Chandra Sarker
    North South University
 */

import java.util.*;

public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < s.length() - 1; j++) {
                if (s.charAt(j) == (s.charAt(j + 1))) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
        sc.close();
    }
}