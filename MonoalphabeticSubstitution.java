package SubstitutionCiphers;
//It is a Mono_alphabetic Cipher
import java.util.Scanner;
public class MonoalphabeticSubstitution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the PlainText: ");
		String message = ob.nextLine();
		message = message.toLowerCase();
		System.out.println("Enter the mapped KEY (unique 26 letters): ");
		String key = ob.nextLine();
		System.out.println("The cipher Text is: "+ convertToCipherText(message , key));
		ob.close();
	}
	static String convertToCipherText(String plainText, String key) {
		String cipherText = "";
		int x; //to store in range 00 to 25
		for(int i=0; i<plainText.length(); i++) {
			char ch = plainText.charAt(i);
			x= ch - 97;
			if(ch == 32)
				cipherText += " ";
			else
				cipherText += key.charAt(x); 
		}
		return cipherText;
	}

}
