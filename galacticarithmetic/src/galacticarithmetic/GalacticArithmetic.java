package galacticarithmetic;

import java.util.Scanner;

public class GalacticArithmetic {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers");
		Scanner scan = new Scanner(System.in);
		long n1 = scan.nextLong();
		long n2 = scan.nextLong();
		long res = galacticAddition(n1,n2);
		System.out.println("Output :"+res);
		
	}
	
	public static long galacticAddition(long num1, long num2) {
		return num1+num2;
	}

}
