import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[][] arr = new int[num][2];
        for(int i=0; i<num; i++) {
            arr[i][0]=scan.nextInt();
            arr[i][1]=scan.nextInt();
        }
        Arrays.sort(arr, new mySort());

        for(int i=0; i<num; i++)
            System.out.println(arr[i][0] + " " + arr[i][1]);
    }
}

class mySort implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2) {
        if(o1[0] == o2[0])
            return o1[1]-o2[1];
        else
            return o1[0]-o2[0];
    }
}