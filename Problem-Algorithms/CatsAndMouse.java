
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class CatsAndMouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int unit1 = Math.abs(z - x);
            int unit2 = Math.abs(z - y);
            
            if (unit1 < unit2) {
                System.out.println("Cat A");
            } else if (unit1 > unit2) {
                System.out.println("Cat B");
            } else if (unit1 == unit2) {
                System.out.println("Mouse C");
            }
        }
        scanner.close();
    }
}
