
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class HurdleRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int height[] = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        int max = height[0];

        for (int i = 0; i < n - 1; i++) {
            if (max < height[i + 1]) {
                max = height[i + 1];
            }
        }

        if (max > k) {
            int dose = max - k;
            System.out.println(dose);
        } else if ((max < k) || (max == k)) {
            System.out.println(0);
        }
        scanner.close();
    }
}
