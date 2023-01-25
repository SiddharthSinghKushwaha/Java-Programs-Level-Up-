package generator;
import java.util.Random;
public class OTP {

	static String generateOTP(int len) { 
		// All possible characters of my OTP 
		String str = "abcdefghijklmnopqrstuvwxyzABCD"
				+"EFGHIJKLMNOPQRSTUVWXYZ0123456789"; 
		int n = str.length(); 

		// String to hold OTP 
		String OTP=""; 

		for (int i = 1; i <= len; i++) {
			//System.out.println((Math.random() ) );
			OTP += (str.charAt((int) ((Math.random()*10) % n)));	//math.random generate 0.0 to  less than 1.0
		}
		
		return(OTP); 
	} 
	public static void main(String[] args) {
			int len = 6; 
			System.out.printf("Your OTP is (using Math.random) - %s\n", generateOTP(len));
			Random rand=new Random();
			String digits = "0123456789";
			int lod = digits.length();	//lod = length of digits
			String OTP_num = "";
			
			for(int i=1; i<= len; i++) {
				OTP_num += digits.charAt(rand.nextInt(lod)); 
			}
			System.out.println("Your digits OTP is (using Random class)" + OTP_num);
	}
}
