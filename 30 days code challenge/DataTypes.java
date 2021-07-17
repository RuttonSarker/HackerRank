
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine();
        String c = sc.nextLine();
        String s = "HackerRank";

        System.out.println(a + (int) b);
        System.out.println(b * 2);
        System.out.println(s.concat(" ").concat(c));
        sc.close();
    }
}
