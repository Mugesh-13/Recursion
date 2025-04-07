package recursion;

import java.util.Scanner;

public class SumOfDigits {
	int sum=0;
	int sumNumbers(int n) {
		if(n>0) {
			sum+=n%10;
			n/=10;
			sumNumbers(n);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scan.nextInt();
		SumOfDigits obj=new SumOfDigits();
		System.out.println(obj.sumNumbers(num));

	}

}
