package scientist;

import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		
			System.out.println("Enter the raduis of sphere(planet) : ");
			Scanner scan = new Scanner(System.in);
			double radius = scan.nextDouble();
			PlanetExplorer pe = new PlanetExplorer();
			double res = pe.calculateSurfaceArea(radius);
			System.out.printf("Area of the planet is : "+"%.2f",res);
			
			
		}

	}


