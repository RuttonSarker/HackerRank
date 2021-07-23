
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class AppleOrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int apple[] = new int[m];
        int orange[] = new int[n];
        int appleCount = 0, orangeCount = 0;

        for (int i = 0; i < m; i++) {
            apple[i] = scanner.nextInt();
            apple[i] += a;
            if (apple[i] >= s && apple[i] <= t) {
                appleCount++;
            }
        }

        for (int j = 0; j < n; j++) {
            orange[j] = scanner.nextInt();
            orange[j] += b;
            if (orange[j] >= s && orange[j] <= t) {
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
        scanner.close();
    }
}