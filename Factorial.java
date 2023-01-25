
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = fact(5);
		System.out.println("The factorail of 5 is "+ ans);
	}
	static int fact(int n) {
		if(n == 1)
			return 1;
		else
			return n* fact(n-1);
	}
}
