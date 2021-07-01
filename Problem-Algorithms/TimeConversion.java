
/*
    Solved by Rutton Chandra Sarker
    North South University
*/
import java.util.*;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] n = s.split(":");
        String remove = s.substring(s.length() - 2);

        if (n[0].equals("12") && remove.equals("AM")) {
            n[0] = "00";
        } else if (n[0].equals("12") && remove.equals("PM")) {
            n[0] = n[0];
        } else if (remove.equals("PM")) {
            int k = Integer.parseInt(n[0]);
            int hour = k + 12;
            n[0] = Integer.toString(hour);
        }

        if (remove.equals("PM")) {
            n[2] = n[2].replace("PM", " ");
        } else {
            n[2] = n[2].replace("AM", " ");
        }
        System.out.print(n[0] + ":" + n[1] + ":" + n[2]);
        scanner.close();
    }
}
