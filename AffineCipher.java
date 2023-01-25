package SubstitutionCiphers;
//It is a Mono_alphabetic Cipher
import java.util.Scanner;
public class AffineCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the PlainText: ");
		String plainText = ob.nextLine();
		plainText = plainText.toLowerCase();
		System.out.println("Enter the KEY1:(for multiplicative) ");
		int key1 = ob.nextInt();
		System.out.println("Enter the KEY2:(for additive) ");
		int key2 = ob.nextInt();
		String cipherText = cipherTextConverter(plainText, key1, key2);
		System.out.println("The cipher Text is: "+ cipherText);
		//Not working here
		System.out.println("the plaintext is: "+ cipherTextConverter(cipherText, inverse(key1), 26-key2)); //inverse of key is found
		ob.close();
	}
	static String cipherTextConverter(String plainText, int key1, int key2) {
		String cipherText = "";
		int x, temp; // x to store to ASCII value of the character
		for(int i=0; i< plainText.length(); i++) {
			
			char ch = plainText.charAt(i);
			x = ch - 97; //to make it in the range 00 to 25, so that it  can be modulo with 26 
			if(ch == 32)	//remove this if you don't want to print space in cipher text
				cipherText += " ";
			else {
				temp = (((x *key1) + key2)% 26)+ 97;
				cipherText += (char)temp;
			}
		}
		return cipherText;
	}
	static int inverse(int a) {
		int b=-1;
		for(int i=0; i<26; i++) {
			if(a*i % 26 == 1) {
				b = i;
				break;
			}
		}
		if(b == -1)
			System.out.println("Inverse of "+ a + " doesn't exit. Key should be ODD number except 13\nThe plaintext will be wrong");
		return b;
	}
}
