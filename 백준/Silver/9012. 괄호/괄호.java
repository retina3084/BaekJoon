import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			String str = sc.next();
			int sum=1;
			if (str.charAt(0) ==')') {System.out.println("NO");}
			else {
				for(int j=1;j<str.length();j++) {
					if(str.charAt(j)=='(') {
						sum+=1;
					}
					else if(str.charAt(j)==')') {
						sum-=1;
					}
                    if(sum<0) break;
				}
				if(sum==0) {System.out.println("YES");}
				else {System.out.println("NO");}
			}
		}
	}

}
