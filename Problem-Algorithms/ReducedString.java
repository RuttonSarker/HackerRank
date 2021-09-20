
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class ReducedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        sc.close();

        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb = sb.delete(i, i + 1 + 1);
                i = -1;
            }
        }
        if (sb.length() == 0) {
            System.out.println("Empty String");
        } else {
            System.out.println(sb);
        }
    }
}