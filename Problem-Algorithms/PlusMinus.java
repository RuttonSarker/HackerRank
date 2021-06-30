
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        double pos = 0, neg = 0, zero = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else if (arr[i] == 0) {
                zero++;
            }
        }

        System.out.format("%.6f\n", (pos / n));
        System.out.format("%.6f\n", (neg / n));
        System.out.format("%.6f", (zero / n));
        input.close();
    }
}
