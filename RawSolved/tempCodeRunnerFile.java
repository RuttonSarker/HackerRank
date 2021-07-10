import java.util.*;

public class 2dArray {
    
    public static void main (String []args){

        int arr[][] = new int[6][6];
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0; i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(arr[i][j]);
    }
}
