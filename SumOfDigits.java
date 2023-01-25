
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigits sod = new SumOfDigits();
		System.out.println("The sum of it's digits is "+ sod.sum(1234));
	}
	int sum(int n) {
		if(n< 10)
			return n;
		else
			return n%10 + sum(n/10);
	}
}
