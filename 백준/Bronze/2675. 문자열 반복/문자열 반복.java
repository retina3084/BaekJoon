import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] r = new int[n];
		String[] s = new String[n];
		
		for (int i=0; i<s.length; i++) {
			r[i] = input.nextInt();
			s[i] = input.next();
		}
		for (int i=0; i<s.length; i++) {
			for (int j=0; j<s[i].length(); j++) {
				for (int k=0; k<r[i]; k++) {
					System.out.print(s[i].charAt(j));	
				}
			}
			System.out.println();
		}
	}
}
