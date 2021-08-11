/*
    Solved By Rutton Chandra Sarker
    North South University
 */

import java.util.*;

public class ViralAdvertising {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int people = 5;
        for (int i = 1; i <= n; i++) {
            int like = people / 2;
            people = like * 3;
            count += like;
        }
        System.out.println(count);
        sc.close();
    }
}