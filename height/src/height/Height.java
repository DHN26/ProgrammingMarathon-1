package height;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		System.out.println("Enter the height in inches");
		Scanner scan = new Scanner(System.in);
		double inches = scan.nextDouble();
		HeightConverter converter = new HeightConverter();
		double res = converter.convertInchesToFeet(inches);
		System.out.printf("People!! the height in inches is : "+"%.2f",res);

	}

}
