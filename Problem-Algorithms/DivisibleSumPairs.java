
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int k = scanner.nextInt();
        int pairs = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                sum = arr[i] + arr[j];
                if (sum % k == 0) {
                    pairs++;
                }
            }
        }
        System.out.println(pairs);
        scanner.close();
    }
}
