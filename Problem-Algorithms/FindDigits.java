/*
    Solved By Rutton Chandra Sarker
    North South University
 */

import java.util.*;

public class FindDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for (int j = n; j != 0; j /= 10) {
                int digit = j % 10;
                if (digit > 0 && n % digit == 0) {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
        sc.close();
    }
}
