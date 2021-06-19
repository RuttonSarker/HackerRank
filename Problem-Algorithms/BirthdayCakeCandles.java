
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class BirthdayCakeCandles {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int max = 0, count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (max == arr[i]) {
                count++;
            }
        }

        System.out.println(count);

    }

}
