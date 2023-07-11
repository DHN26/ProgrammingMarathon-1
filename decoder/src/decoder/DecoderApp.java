package decoder;

import java.util.Scanner;

public class DecoderApp {

	public static void main(String[] args) {
		System.out.println("Enter a character");
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		MessageDecoder decode = new MessageDecoder();
		int res = decode.decodeCharacter(c);
		System.out.println(res);

	}

}
