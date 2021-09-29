/*
    Solved By Rutton Chandra Sarker
    North South University
*/

import java.util.*;

public class Pangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = s.replace(" ", "");
        System.out.println(p);
        sc.close();
    }
}
