
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class MiniMaxSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long arr1[] = new long[5];
        long arr2[] = new long[5];
        long sum = 0, max = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (i != j) {
                    sum += arr1[j];
                }
            }
            arr2[i] = sum;
            sum = 0;
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
            }
        }

        long min = arr2[0];

        for (int i = 0; i < arr2.length - 1; i++) {
            if (min < arr2[i + 1]) {
                continue;
            } else {
                min = arr2[i + 1];
            }
        }

        System.out.print(min + " " + max);

    }
}
