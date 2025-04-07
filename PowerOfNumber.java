package recursion;

import java.util.Scanner;

public class PowerOfNumber {
	int res=1;
	public int calculatePower(int b,int p) {
		if(p>0) {
			res*=b;
			calculatePower(b,--p);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Value of base");
		int base=scan.nextInt();
		System.out.println("Enter the Value of Power");
		int power=scan.nextInt();
		PowerOfNumber obj=new PowerOfNumber();
		System.out.println(obj.calculatePower(base,power));
	}

}
