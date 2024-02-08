import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arrayA = new int[n];

        for(int i=0; i<n; i++) {
            arrayA[i] = scan.nextInt();
        }
        Arrays.sort(arrayA);

        int m = scan.nextInt();
        for(int i=0; i<m; i++) {
            int x = scan.nextInt();
            if(Arrays.binarySearch(arrayA,x)>=0)
                System.out.println("1");
            else
                System.out.println("0");
        }
        
    }
}