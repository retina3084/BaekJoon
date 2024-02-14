import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.nextLine();
        for(int i=0; i<number; i++){
            String ps = scan.nextLine();

            if(isVPS(ps)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }

    private static boolean isVPS(String ps) {
        Stack<Integer> stack = new Stack<>();
        try {
            for (int i=0; i < ps.length(); i++) {
                if (ps.charAt(i) == '(') {
                    stack.push(0);
                } else if (ps.charAt(i) == ')') {
                    stack.pop();
                }
            }

            if(stack.isEmpty()) {
                return true;
            }
            else {
                return false;
            }
        }
        catch (EmptyStackException e) {
            return false;
        }
    }
}