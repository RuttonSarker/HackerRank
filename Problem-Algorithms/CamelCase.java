
/*
    Solved By Rutton Chandra Sarker
    North South University
 */

import java.util.*;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;

        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i);
            if (value >= 65 && value <= 90) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
