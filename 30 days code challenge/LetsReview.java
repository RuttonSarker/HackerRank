
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class LetsReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t != 0) {

            String s = sc.nextLine();
            String a = "";
            String b = "";

            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    a = a + s.charAt(i);
                } else {
                    b = b + s.charAt(i);
                }
            }
            System.out.println(a + " " + b);
            t--;
        }
        sc.close();
    }
}