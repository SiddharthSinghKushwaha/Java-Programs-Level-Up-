package generator;
import java.util.Random;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the length of password You want to generate: ");
		int length = ob.nextInt();
		String digit = "0123456789";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String upperCase = "ABCDEFGHIJKLMNOPQRSUVWXYZ";
		String alphabet = lowerCase + upperCase;
		String special_character = "!@#$%^&* -_";
		String character = digit + alphabet + special_character;
		String password = "";
		//satisfying the condition that  at least one CHARACTER is digit, lowerCase, upperCase and special character
		password += digit.charAt(r.nextInt(digit.length()));
		password += lowerCase.charAt(r.nextInt(lowerCase.length()));
		password += upperCase.charAt(r.nextInt(upperCase.length()));
		password += special_character.charAt(r.nextInt(special_character.length()));
		
		for(int i = 1; i<= length-4; i++) {
			password += character.charAt(r.nextInt(character.length()));
		}
		System.out.println("\nThe strong password of length "+ length + " is :"+ password);
		ob.close();
	}
	
}
