
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;
import java.lang.Math;

public class Loops_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            sum = 0;
            System.out.println();
        }
        scanner.close();
    }
}
