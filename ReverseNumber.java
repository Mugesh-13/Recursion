package recursion;

import java.util.Scanner;

public class ReverseNumber {
	void reverse(int a) {
		
		if(a>0) {
			System.out.print(a%10);
			a/=10;
			reverse(a);
		}
	}
	public static void main(String[] args) {
		ReverseNumber obj=new ReverseNumber();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Number");
		int n=scan.nextInt();
		obj.reverse(n);
	}

}
