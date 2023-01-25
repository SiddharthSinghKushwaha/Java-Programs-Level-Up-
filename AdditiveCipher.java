package SubstitutionCiphers;
// It is a Mono_alphabetic Cipher
import java.util.Scanner;
public class AdditiveCipher { //Additive cipher or Shift cipher or caesar cipher

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the PlainText: ");
		String plainText = ob.nextLine();
		System.out.print("Enter the KEY: ");
		int key = ob.nextInt();
		String cipherText = converter(plainText, key);
		System.out.println("\nThe cipher Text is: "+ cipherText);
		//encryption here done
		System.out.println("The original message was: "+ converter(cipherText, 26-key));
		ob.close();
	}
	static String converter(String plainText, int key) {
		String cipherText = "";
		//int x, temp; // x to store to ASCII value of the character
		for(int i=0; i< plainText.length(); i++) {
			if(plainText.charAt(i)== ' ')
				cipherText+= plainText.charAt(i);
			else {
				if (Character.isUpperCase(plainText.charAt(i))) 
	            { 
	                char ch = (char)(((int)plainText.charAt(i) + key - 65) % 26 + 65); 
	                 cipherText+= ch;
	            } 
	            else
	            { 
	                char ch = (char)(((int)plainText.charAt(i) + key - 97) % 26 + 97); 
	                cipherText+= ch;
	            }
			}
			  
			/*
			char ch = plainText.charAt(i);
			x = ch - 97; //to make it in the range 00 to 25, so that it  can be modulo with 26 
			if(ch == 32)	//remove this if you don't want to print space in cipher text
				cipherText += " ";
			else {
				temp = ((x + key)% 26)+ 97;
				cipherText += (char)temp;
			}*/
		}
		return cipherText;
	}
}
