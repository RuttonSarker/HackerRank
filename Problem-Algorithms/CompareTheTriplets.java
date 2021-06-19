/*
 Solved by Rutton Chandra Sarker
 North South University
 */

import java.util.*;

public class CompareTheTriplets {

    public static void main(String[] args) {
        int a[] = new int[3];
        int b[] = new int[3];
        int c[] = { 0, 0 };

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = input.nextInt();
        }

        for (int j = 0; j < a.length; j++) {
            if (a[j] > b[j]) {
                c[0]++;
            } else if (a[j] < b[j]) {
                c[1]++;
            }
        }
        for (int j = 0; j < c.length; j++) {
            System.out.print(c[j] + " ");
        }

    }

}
