
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class GradingStudents {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int grade[] = new int[n];
        int score = 0;

        for (int i = 0; i < n; i++) {
            grade[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (grade[i] < 38) {
                score = grade[i];
            } else if ((grade[i] % 10) < 5) {
                score = (5 - (grade[i] % 10)) + grade[i];
            } else if ((grade[i] % 10) >= 5) {
                score = (10 - (grade[i] % 10)) + grade[i];
            }

            if ((score - grade[i]) < 3) {
                System.out.println(score);
            } else {
                System.out.println(grade[i]);
            }
        }
        s.close();
    }
}
