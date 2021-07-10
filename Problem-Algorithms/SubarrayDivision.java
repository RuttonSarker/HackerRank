
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class SubarrayDivision {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int count = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int d = s.nextInt();
        int m = s.nextInt();

        for (int i = 0; i < n; i++) {
            int limit = i + m;
            if (limit > n) {
                break;
            }

            for (int j = 0; j < m; j++) {
                sum += arr[i + j];
            }

            if (sum == d) {
                count++;
            }
            sum = 0;
        }

        System.out.println(count);
        s.close();
    }
}
