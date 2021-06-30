/*
 Solved by Rutton Chandra Sarker
 North South University
 */

import java.util.*;

public class VeryBigSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long arr[] = new long[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {

            arr[i] = input.nextLong();
            sum += arr[i];
        }
        System.out.println(sum);
        input.close();
    }

}
