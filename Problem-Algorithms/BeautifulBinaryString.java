/*
    Solved By Rutton Chandra Sarker
    North South University
*/

import java.util.*;

public class BeautifulBinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s[] = new String[n];
        int count = 0;

        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine();
        }

        for (int j = 0; j <= s.length - 3;) {
            if (s[j] == "0" && s[j + 1] == "1" && s[j + 2] == "0") {
                count++;
                j += 3;
            } else {
                j += 1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}