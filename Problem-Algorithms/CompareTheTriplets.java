/*
 Solved by Rutton Chandra Sarker
 North South University
 */
package comparethetriplets;

import java.util.*;

public class CompareTheTriplets {

    public static void main(String[] args) {
        int a[] = new int[100];
        int b[] = new int[100];
        int c[] = {0, 0};

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            b[i] = input.nextInt();
        }

        for (int j = 0; j < 3; j++) {
            if (a[j] > b[j]) {
                c[0]++;
            } else if (a[j] < b[j]) {
                c[1]++;
            } 
        }
        for (int j = 0; j < 2; j++) {
            System.out.print(c[j] + " ");
        }

    }

}
