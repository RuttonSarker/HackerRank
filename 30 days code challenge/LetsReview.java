
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class LetsReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char even = ' ';
        char odd = ' ';
        sc.close();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                even = s.charAt(i);
                System.out.println(even);
            } else {
                odd = s.charAt(i);
                System.out.println(odd);
            }
        }
    }
}
