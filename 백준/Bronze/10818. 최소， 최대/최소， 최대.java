import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		int array_size = input.nextInt();
		int[] array = new int[array_size];
		
		for(int i=0; i<array_size; i++) {
			array[i] = input.nextInt();
		}
		
		Arrays.sort(array);		
		System.out.printf("%d %d",array[0], array[array_size-1]);
		
	}
}