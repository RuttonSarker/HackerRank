
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class StringIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String a1 = a.substring(0, 1).toUpperCase() + a.substring(1);
        String b1 = b.substring(0, 1).toUpperCase() + b.substring(1);
        String c = a1.concat(" ").concat(b1);
        System.out.println(c.length() - 1);

        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(c);
        sc.close();
    }
}
