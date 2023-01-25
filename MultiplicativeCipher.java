package SubstitutionCiphers;
//It is a Mono_alphabetic Cipher
import java.util.Scanner;
public class MultiplicativeCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the PlainText: ");
		String plainText = ob.nextLine();
		System.out.println("Enter the KEY: ");
		int key = ob.nextInt();
		
		String cipherText = cipherTextConverter(plainText, key);
		System.out.println("The cipher Text is: "+ cipherText);
		System.out.println("the plaintext is: "+ cipherTextConverter(cipherText, inverse(key))); //inverse of key is found 
		ob.close();
	}
	static String cipherTextConverter(String plainText, int key) {
		//handling if key is negative
		if(key == -1)
			System.out.println("Plaintext result will be wrong because invalid KEY entered by user");
		
		String cipherText = "";
		int x, temp; // x to store to ASCII value of the character
		for(int i=0; i< plainText.length(); i++) {
				
		char ch = plainText.charAt(i);
		x = ch - 97; //to make it in the range 00 to 25, so that it  can be modulo with 26 
		if(ch == 32)	//remove this if you don't want to print space in cipher text
			cipherText += " ";
		else {
				temp = ((x * key)% 26)+ 97;
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
			System.out.println("Inverse of "+ a + " doesn't exit. Key should be ODD number except 13\n");
		return b;
	}
}
