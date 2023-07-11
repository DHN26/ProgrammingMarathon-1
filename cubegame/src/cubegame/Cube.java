package cubegame;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		System.out.println("Enter a number for Power of cube game");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int res = cubeNumber(num);
		System.out.println("The result is : "+res);
		

	}
	public static int cubeNumber(int num) {
		return (num*num*num);
	}

}
