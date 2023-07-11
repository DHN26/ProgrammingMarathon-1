package string;

import java.util.Scanner;

public class StringConcatenation {

	public static void main(String[] args) {
		System.out.println("Enter 2 strings");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		String res =joinStrings(s1,s2);
		System.out.println("Concatenated String : "+res);
		
	}
	
	public static String joinStrings(String str1, String str2)
	{
		return str1+str2;
		 
	}

}
