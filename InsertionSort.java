
public class InsertionSort {

	public static void main(String[] args) {
		int arr1[]= {4,6,2,1,7,5};
		isort(arr1);
	}
	static void isort(int[] a) {
		
		for(int i=1; i<a.length; i++){
			int key= a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		print_i(a);
	}
	static void print_i(int[] a) {
		System.out.print("The element of array is: ");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
	}
}