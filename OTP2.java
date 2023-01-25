package generator;
import java.util.Random;
public class OTP2 {
	
	public static void main(String args[]) {
		int len = 6;
		Random rand=new Random();
		String digits = "0123456789";
		int lod = digits.length();	//lod = length of digits
		String OTP_num = "";
		for(int i=1; i<= len; i++) {
			OTP_num += digits.charAt(rand.nextInt(lod)); 
		}
		System.out.println("Your digits OTP is " + OTP_num);
	}
}
