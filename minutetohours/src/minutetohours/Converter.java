package minutetohours;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		System.out.println("Enter the time in minutes :");
		Scanner scan = new Scanner(System.in);
		int min = scan.nextInt();
		double res = convertToHours(min);
		System.out.printf("Time in hours is : "+"%.2f",res);
	}
	public static double convertToHours(int minutes) {
		double hour = (double)minutes/60;
		return hour;
		
		
	}

}
