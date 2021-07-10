
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class BillDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int bill[] = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            bill[i] = scanner.nextInt();
        }

        int b = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (i != k) {
                total += bill[i];
            }
        }

        int anna = total / 2;
        if ((anna - b) == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - anna);
        }
        scanner.close();
    }
}