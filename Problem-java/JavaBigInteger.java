
/*
    Solved By Rutton Chandra Sarker
    North South University
 */
import java.util.*;
import java.math.*;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        sc.close();
    }
}
