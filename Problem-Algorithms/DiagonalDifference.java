
/*
    Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class DiagonalDifference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        int sum1 = 0, sum2 = 0;
        int k = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum1 += arr[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            sum2 += arr[i][k--];
        }

        System.out.println(Math.abs(sum1 - sum2));
        scanner.close();
    }
}
