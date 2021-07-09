
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class ElectronicsShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int keyboard[] = new int[n];
        int drives[] = new int[m];
        int max = -1, sum = 0;

        for (int i = 0; i < n; i++) {
            keyboard[i] = sc.nextInt();
        }
        for (int j = 0; j < m; j++) {
            drives[j] = sc.nextInt();
        }
        for (int p = 0; p < n; p++) {
            for (int q = 0; q < m; q++) {
                sum = keyboard[p] + drives[q];
                if (sum > max && sum <= b) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
        sc.close();
    }
}