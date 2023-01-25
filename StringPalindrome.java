
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "SiddiS";
		boolean ans = checkPalindrome(str, 0, str.length()-1 );
		System.out.println("The input string is palindrome: "+ ans);
	}
	static boolean checkPalindrome(String str, int start, int end){
		if(start > end)
			return true;
		if(str.charAt(start) != str.charAt(end))
			return false;
		else
			return checkPalindrome(str, start+1, end-1);
	}

}
