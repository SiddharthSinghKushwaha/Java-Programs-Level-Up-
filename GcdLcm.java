import java.util.Scanner;
public class GcdLcm {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter a two number to find GCD & LCM");
		int num1 = ob.nextInt();
		int num2 = ob.nextInt();
		int ans = gcd(num1, num2);
		System.out.println("The GCD of two numbers is "+ ans);
		System.out.println("The LCM of the sum is "+ num1*num2 / ans);
		ob.close();
	}

	static int gcd(int a, int b) {
		if(a == 0)
			return b;
		if(b== 0)
			return a;
		if(a == b)
			return a;
		if(a>b)
			return gcd(a-b, b);
		return gcd(a, b-a);
	}
}
