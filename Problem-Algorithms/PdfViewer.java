
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class PdfViewer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h[] = new int[26];
        int max = 0;

        for (int i = 0; i < h.length; i++) {
            h[i] = sc.nextInt();
        }

        sc.nextLine();
        String s = sc.nextLine();

        for (int j = 0; j < s.length(); j++) {
            char a = s.charAt(j);
            int value = a - 97;

            if (max < h[value]) {
                max = h[value];
            }
        }

        int area = max * s.length();
        System.out.println(area);
        sc.close();
    }
}
