
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = 0, count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == s.charAt(k)) {
                count++;
                k++;
            }
        }
        if (count == s.length()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}