import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static Stack<Integer> myStack = new Stack<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int number = scan.nextInt();

        for (int i = 0; i < number; i++) {
            String command = scan.next();

            switch (command) {
                case "push":
                    myStack.push(scan.nextInt());
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    public static int pop() {
        if (myStack.isEmpty())
            return -1;
        else {
            return myStack.pop();
        }
    }

    public static int size() {
        return myStack.size();
    }

    public static int empty() {
        if (myStack.isEmpty())
            return 1;
        else
            return 0;
    }

    public static int top() {
        if (myStack.isEmpty())
            return -1;
        else
            return myStack.peek();
    }


}