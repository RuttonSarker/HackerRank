
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class BeautifulDaysMovies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int count = 0, reverse = 0;

        for (int m = i; m <= j; m++) {
            for (int p = m; p != 0; p /= 10) {
                int digit = p % 10;
                reverse = reverse * 10 + digit;
            }
            if (Math.abs(m - reverse) % k == 0) {
                count++;
            }
            reverse = 0;
        }
        System.out.println(count);
        sc.close();
    }
}