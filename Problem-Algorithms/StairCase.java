
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class StairCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = 1;
        int q = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - p; j++) {
                System.out.print(" ");
            }

            for (int k = q; k < n + 1; k++) {
                System.out.print("#");
            }
            System.out.println();
            p++;
            q--;
        }
        scanner.close();
    }
}
