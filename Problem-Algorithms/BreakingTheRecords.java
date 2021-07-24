
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class BreakingTheRecords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int bestRecord = 0, worstRecord = 0;
        int scores[] = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = s.nextInt();
        }

        int max = scores[0], min = scores[0];

        for (int i = 0; i < n - 1; i++) {
            if (max < scores[i + 1]) {
                max = scores[i + 1];
                bestRecord++;
            }
            if (min > scores[i + 1]) {
                min = scores[i + 1];
                worstRecord++;
            }
        }

        System.out.print(bestRecord + " " + worstRecord);
        s.close();
    }
}
