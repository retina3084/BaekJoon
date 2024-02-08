import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> prime = new ArrayList<>();
        for (int number = 2; number<1000; number++) {
            if(isPrime(number)) prime.add(number);
        }

        Scanner scan = new Scanner(System.in);
        int answer = 0;
        int count = scan.nextInt();
        for (int i =0; i<count; i++) {
            if(prime.contains(scan.nextInt()))
               answer++;
        }

        System.out.println(answer);

    }

    static boolean isPrime(int number) {

        if(number == 1) return false;

        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }

        return true;
    }

}
