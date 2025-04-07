package recursion;

import java.util.Scanner;

public class DecimalToBinary {
	StringBuilder sb=new StringBuilder();
	public String toBinary(int n) {
		if(n>0) {
			sb.insert(0,(n%2)+"");
			n/=2;
			toBinary(n);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scan.nextInt();
		DecimalToBinary obj=new DecimalToBinary();
		System.out.println(obj.toBinary(num));
	}

}
