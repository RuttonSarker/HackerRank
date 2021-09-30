
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = 0, type = 0;

        for (int i = 0; i < arr.length; i++) {
            int bird = sc.nextInt();
            arr[bird - 1]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                type = i + 1;
            }
        }
        System.out.println(type);
        sc.close();
    }
}