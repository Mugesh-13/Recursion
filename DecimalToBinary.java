package recursion;

import java.util.Scanner;

public class DecimalToBinary {
	public void toBinary(int n) {
		if(n>0) {
			toBinary(n/2);
			System.out.print(n%2);
		}
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scan.nextInt();
		DecimalToBinary obj=new DecimalToBinary();
		obj.toBinary(num);
	}

}
