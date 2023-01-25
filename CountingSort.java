import java.util.Scanner;
public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int arr[] = {0,4,2,0,3,1,1,3,2,4};
		CountingSort c = new CountingSort(); 
		System.out.print("Enter the last value of Range: ");
		int k = ob.nextInt();
		System.out.println("Given Array is: ");
		c.printArray(arr);
		int ans[] = sort(arr, k);
		System.out.println("Sorted Array is: ");
		c.printArray(ans);
		ob.close();
	}
	void printArray(int a[]) {
		for(int i: a)
			System.out.print(i + " ");
		System.out.println();
	}
	static int[] sort(int a[], int k) {
		int b[] = new int[a.length];
		int c[] = new int[k+1];
		d
		for(int i=0; i<k; i++)
			c[i] = 0;
		
		for(int i=0; i<a.length; i++)
			c[a[i]]++;
		
		for(int i=1; i<=k; i++)
			c[i]+= c[i-1];
		
		for(int i= a.length-1; i>=0; i--) {
			b[c[a[i]]-1] = a[i];
			c[a[i]]--; 
		}
		return b;
	}
}
