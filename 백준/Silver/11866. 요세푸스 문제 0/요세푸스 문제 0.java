import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int headcount = scan.nextInt();
        for(int i=0; i<headcount; i++) {
            queue.add(i+1);
        }

        int number = scan.nextInt();

        System.out.print("<");
        while(!queue.isEmpty()) {
            for (int i = 0; i < number-1; i++) {
                int x = queue.poll();
                queue.add(x);
            }
            System.out.print(queue.poll());
            if(!queue.isEmpty())
                System.out.print(", ");
            else
                System.out.println(">");
        }

    }

}
