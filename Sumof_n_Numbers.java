package recursion;

import java.util.Scanner;
	
public class Sumof_n_Numbers {
	int i=1;
	int sum=0;
	int sumOfNumbers(int n) {
		if(i<=n) {
			sum+=i++;
			sumOfNumbers(n--);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Value of n");
		int n=scan.nextInt();
		Sumof_n_Numbers obj=new Sumof_n_Numbers();
		System.out.println(obj.sumOfNumbers(n));

	}

}
