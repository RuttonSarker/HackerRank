
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            int h = 0;
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    h = h + 1;
                } else {
                    h = h * 2;
                }
            }
            System.out.println(h);
            t--;
        }
        sc.close();
    }
}
