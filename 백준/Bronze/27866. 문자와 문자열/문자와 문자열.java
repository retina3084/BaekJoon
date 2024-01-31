import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int input = Integer.parseInt(scan.nextLine());
        input--;
        System.out.println(str.charAt(input));
    }
}