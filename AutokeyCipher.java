package SubstitutionCiphers;
//It is a poly_alphabetic cipher
import java.util.Scanner;
public class AutokeyCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the PlainText: ");
		String message = ob.nextLine();
		message = message.toLowerCase();
		System.out.println("Enter the initial Key vaue: ");
		int key = ob.nextInt();
		String cipherText = cipherTextConverter(message, key);
		System.out.println("The cipher Text is: "+ cipherText);
		//System.out.println("the plaintext is: "+ cipherTextConverter(cipherText, 26-key));
		ob.close();
	}
	static String cipherTextConverter(String plainText, int key) {
		String cipherText = " ";
		int x, y, temp; //x ,y to sore in range 0 to 25
		for(int i= 0; i< plainText.length(); i++) {
			char ch = plainText.charAt(i);
			x = ch - 97;
			
			if(i == 0) {
				temp = ((x + key)% 26)+ 97;
				 cipherText += (char)temp;
			}else if(ch == 32) {
				cipherText += " ";
			}else {
				char ch1 = plainText.charAt(i-1);
				if(ch1 == ' ') {
					ch1 = plainText.charAt(i-2);
					y = ch1 - 97;
					temp = ((x + y)% 26)+ 97; //here key = y for all character except 1st one
					cipherText += (char)temp;
				}else {
					y = ch1 - 97;
					temp = ((x + y)% 26)+ 97; //here key = y for all character except 1st one
					cipherText += (char)temp;
				}
			}
		}
		return cipherText;
	}
}
