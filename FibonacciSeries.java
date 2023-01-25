
public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("The 8th fibonacci series is "+ fibo(8));
	}
	static int fibo(int num) {
		if(num <= 1)
			return num;
		else
			return fibo(num-1)+fibo(num-2);
	}
}
