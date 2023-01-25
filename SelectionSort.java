
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,4,3,2,1};
		SelectionSort s= new SelectionSort();
		s.sort(arr);
	}
	public void sort(int arr[]) {
		System.out.println("\nBefore sorting the array");
		print(arr);
		int min;
		for(int i=0; i<arr.length-1; i++) {
			min = i;
			for(int j= i+1; j< arr.length; j++) {
				if(arr[j]< arr[min])
					min= j;
			}
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println("\nAfter sorting: ");
		print(arr);
	}
	static void print(int[] a) {
		System.out.print("The element of array is: ");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
	}

}
