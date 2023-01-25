package TranspositionCiphers;
//key-less transposition ciphers
import java.util.Scanner; 
public class RailFenceCipher { // cipher text is created reading the pattern row by row

	public static void main(String[] args) {
		
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the PlainText: ");
		String plainText = ob.nextLine();
		String encry = cipherTextConverter(plainText);
		System.out.println("The cipher text is: "+ encry);
		System.out.println("The plain text is: "+ plainTextCoverter(encry));
		ob.close();
	}
	static String cipherTextConverter(String pt) { //pt means Plain Text 
		String cipherText1 = "";
		String cipherText2 = "";
		int count=0;
		for(int i=0; i<pt.length(); i++) {
			
			char ch = pt.charAt(i);
			//considering space in converting
			if(count%2 == 0)
				cipherText1 +=  ch;	//for 1st row
			else
				cipherText2 += ch;	//for 2nd row
			count++;
			/*without space
			if(ch == ' ')
				continue;
			else {
				if(count%2 == 0)
					cipherText1 +=  ch;	//for 1st row
				else
					cipherText2 += ch;	//for 2nd row
				count++;
			}*/
		}
		return cipherText1 + cipherText2;
	}
	// Decryption code
	static String plainTextCoverter(String cipher) {
		String plainText = "";
		//since there is only two row
		int middle = (int)Math.ceil(cipher.length()/2.0);
		String smallText1 = cipher.substring(0, middle);
		String smallText2 = cipher.substring(middle);
		int index = 0;
		int end = smallText1.length() < smallText2.length()? smallText1.length() : smallText2.length();
		for(int i = 0; i<end ; i++) {
			plainText += smallText1.charAt(i);// smallText2.charAt(i);
			plainText += smallText2.charAt(i);
			index++;
		}
		//for unequal substring. To character add last character to plaintext
		if(index != smallText1.length())
				plainText += smallText1.charAt(index);	
		if(index != smallText2.length())
				plainText += smallText2.charAt(index);
		return plainText;
	}
	/*static String cipherTextConverter2(String pt) {
		String ans = "";
		int length = pt.length();
		String part[]= new String[4];
		if(length%4 != 0) {
			for(int i=length-1; i%4 != 0; i++) {
				pt+= " ";
			}
		}
		int start=0, end=4;
		for(int i=0; i< 4; i++) {
			part[i] = pt.substring(start, end);
			start+= 4;
			end+= 4;
		}
		for(int i=0; i<4; i++) {
			ans += part[0].charAt(i) + part[1].charAt(i) + part[2].charAt(i) + part[3].charAt(i); 
		}
		return ans;
	}*/
}
