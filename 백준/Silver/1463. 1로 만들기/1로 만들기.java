import java.util.Scanner;

public class Main {
    static int[] arr;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        arr = new int[x + 1];
        arr[1] = 1;
        
        System.out.println(func(x)-1);
    }

    private static int func(int x) {

        if (arr[x] == 0) {
            if (x % 6 == 0) {
                arr[x] = Math.min(func(x / 3), func(x / 2)) + 1;
            }
            else if (x % 3 == 0) {
                arr[x] = Math.min(func(x / 3), func(x - 1)) + 1;
            }
            else if (x % 2 == 0) {
                arr[x] = Math.min(func(x / 2), func(x - 1)) + 1;
            }
            else {
                arr[x] = func(x - 1) + 1;
            }
        }
        return arr[x];
    }

}