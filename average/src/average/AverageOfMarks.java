package average;

import java.util.Scanner;

public class AverageOfMarks {

	public static void main(String[] args) {
		System.out.println("Enter the marks of 8 semesters");
		Scanner scan = new Scanner(System.in);
		int m1 = scan.nextInt();
		int m2 = scan.nextInt();
		int m3 = scan.nextInt();
		int m4 = scan.nextInt();
		int m5 = scan.nextInt();
		int m6 = scan.nextInt();
		int m7 = scan.nextInt();
		int m8 = scan.nextInt();
		double res = calculateAverage(m1,m2,m3,m4,m5,m6,m7,m8);
		System.out.printf("%.2f",res);
		

	}
	
	public static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8) {
		double avg = (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
		return avg;
	}

}
