
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int count = 0, turn = 0;
        for (int i = 2; i <= n - 1; i += 2) {
            turn++;
            if (p == 1) {
                count = 0;
                break;
            } else if (i == p || i + 1 == p) {
                count += turn;
                break;
            }
        }
        for (int i = n; i > 2; i--) {
            
        }
        System.out.println(count);
        sc.close();
    }
}
