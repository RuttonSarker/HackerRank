
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class NumberLineJumps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jump[] = new int[4];
        int samelocation = 0;

        for (int i = 0; i < jump.length; i++) {
            jump[i] = scanner.nextInt();
        }
        int location1 = jump[0], location2 = jump[2];
        for (int i = 0; i < 10000; i++) {
            location1 += jump[1];
            location2 += jump[3];
            if (location1 == location2) {
                samelocation++;
            }
        }
        if (samelocation > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}