import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int center = scan.nextInt()-1;
        int size = 2*center+1;
        
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if(Math.abs(center-i)+Math.abs(center-j)<=center)
                    System.out.print("*");
                else if (j>center)
                    break;
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

}