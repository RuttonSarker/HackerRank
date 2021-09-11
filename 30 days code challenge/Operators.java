
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mealCost = sc.nextDouble();
        int tipPercent = sc.nextInt();
        int taxPercent = sc.nextInt();

        Double totalCost = (mealCost + (((double) tipPercent / 100) * mealCost)
                + (((double) taxPercent / 100) * mealCost));

        System.out.println(Math.round(totalCost));
        sc.close();
    }
}
