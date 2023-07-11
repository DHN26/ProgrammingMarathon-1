package arithmeticoperation;

public class Arithmetic {

	public static void main(String[] args) {
		
		int a = subtractNumbers(20,5);
		int b = multiplyNumbers(4, 5);
		double c = divideNumbers(22,4);
		int d = findRemainder(10,3);
		System.out.println("Subtraction : "+a);
		System.out.println("Multiplication : "+b);
		System.out.printf("Division : "+"%.2f\n",c);
		System.out.println("REmainder : "+d);
		
		}
	public static int subtractNumbers(int num1,int num2) {
		int res = num1 - num2;
		return res;
	}
	
	public static int multiplyNumbers(int num1,int num2) {
		int res = num1 * num2;
		return res;
	}
	
	public static double divideNumbers(int num1,int num2) {
		double res = num1 / num2;
		return res;
	}
	
	public static int findRemainder(int num1,int num2) {
		int res = num1 % num2;
		return res;
	}

}		
		
		


	

	


