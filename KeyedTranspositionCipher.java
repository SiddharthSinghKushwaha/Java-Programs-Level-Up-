package TranspositionCiphers;

import java.util.Scanner;
public class KeyedTranspositionCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob= new Scanner(System.in);
		System.out.println("Enter the PlainText:(no white space allowed) ");
		String plainText = ob.nextLine();
		System.out.println("Enter the Block size: ");
		int size= ob.nextInt();
		System.out.println("Enter the KEY sequence of size "+ size);
		int key = ob.nextInt();
		int length = plainText.length();
		//Adding Bogus letter 'z' if not multiple of size
		if(length%size != 0) {
			for(int i=length; i%size != 0; i++)
				plainText += "z";
		}
		//System.out.println(plainText);
		key = reverse(key);
		String ciperText = "";
		for(int i=0; i< plainText.length(); i+= size) {
			String sendText = "";
			sendText = plainText.substring(i, i+ size);
			ciperText += ciperTextConverter(sendText, key);
		}
		System.out.println("The cipher text is: "+ ciperText);
		ob.close();
	}
	static String ciperTextConverter(String pt, int k) {
		String cipherText = "";
		for(int i=0; i< pt.length(); i++) {
			int key= k%10;
			cipherText+= pt.charAt(key-1);
			k/= 10;
		}
		return cipherText;
	}
	static int reverse(int num) {
		int ans=0;
		while(num != 0) {
			int d= num%10;
			ans = ans*10 + d;
			num/= 10;
		}
		return ans;
	}
}
