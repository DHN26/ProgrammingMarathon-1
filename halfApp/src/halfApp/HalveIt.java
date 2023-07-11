package halfApp;

import java.util.Scanner;

public class HalveIt {

	public static void main(String[] args) {
		System.out.println("Enter the amount");
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		double res = halveTheNumber(num);
		System.out.println("Splitted amount : "+res);
		

	}
	
	public static double halveTheNumber(double num) {
		return num/2;
	}

}
