import java.util.*;

public class UnexpectedDemand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) {

            if (arr[j] <= k) {
                count++;
                k = k - arr[j];
            }
        }
        System.out.println(count);
        sc.close();
    }
}
