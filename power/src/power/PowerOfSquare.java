package power;

import java.util.Scanner;

public class PowerOfSquare {

	public static void main(String[] args) {
		System.out.println("Enter a number for Power of squares game");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int res = squareNumber(num);
		System.out.println("The result is : "+res);
		
		

	}
	public static int squareNumber(int num) {
		return num*num;
	}

}
