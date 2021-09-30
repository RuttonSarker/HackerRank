
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class LoveLetterMystery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            String s = sc.next();
            int j = s.length() - 1;
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) > s.charAt(j)) {
                    count += Math.abs(s.charAt(i) - s.charAt(j));
                }
                j--;
            }
            n--;
            System.out.println(count);
        }
        sc.close();
    }
}
