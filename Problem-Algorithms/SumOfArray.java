/*
Solved By Rutton Chandra Sarker
North South University
 */
package sumofarray;

import java.util.*;

public class SumOfArray {

    static int simpleArraySum(int[] ar) {

        int sum = 0;
        
        for (int i = 0; i < ar.length; i++) {
            sum = ar[i] + sum;
        }
        
        System.out.println(sum);
        return 0;
    }

    public static void main(String[] args) {

        int ar[] = new int[1000];
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            ar[i] = input.nextInt();
        }

        simpleArraySum(ar);
    }
}
