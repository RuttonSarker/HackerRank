/*
    Solved By Rutton Chandra Sarker
    North South University
 */

import java.util.*;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(s.substring(start, end));
        sc.close();
    }
}
