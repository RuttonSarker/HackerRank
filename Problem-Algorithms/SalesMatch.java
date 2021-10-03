
/*
    Solved By Rutton Chandra Sarker
    North South University
 */
import java.util.*;

public class SalesMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int pairs = 0;
        Set<Integer> match = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (!match.contains(arr[i])) {
                match.add(arr[i]);
            } else {
                pairs++;
                match.remove(arr[i]);
            }
        }
        System.out.println(pairs);
        sc.close();
    }
}