
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class AngryProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int onTime = 0;

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] <= 0) {
                    onTime++;
                }
            }
            if (onTime >= k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            onTime = 0;
        }
        sc.close();
    }
}
