
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int n = 5;
		int ans = son(n); // we can also use the n(n+1)/2
		System.out.println("The sum of the 5th natural number is "+ ans);
		System.out.println("The sum of the 5th natural number(using the formula) is "+ n*(n+1)/2);
	}
	static int son(int num) {
		if(num == 1)
			return 1;
		else
			return num + son(num-1); 
	}

}
