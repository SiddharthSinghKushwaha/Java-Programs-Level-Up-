package divide_Conquer;

public class QuickSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSorting q = new QuickSorting();
		int arr[] = {12, 7, 4, 34, 2, 9};
		System.out.println("The array is: ");
		printArray(arr);
		q.quickSort(arr, 0, arr.length-1 );
		System.out.println("The Sorted array is: ");
		printArray(arr);
	}
	static void printArray(int a[]) {
		for(int i: a)
			System.out.print(i + " ");
		System.out.println();
	}
	void quickSort(int a[], int p, int r) {
		if(p<r) {
			int q = partition(a, p, r);
			quickSort(a, p, q-1);
			quickSort(a, q+1, r);
		}
	}
	int partition(int a[], int p, int r) {
		int ele=a[r];
		int i = p-1;
		for(int j=p; j<r ; j++) {
			if(a[j] <= ele) {
				i++;
				
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}

		int temp = a[r];
		a[r] = a[i+1];
		a[i+1] = temp;
		
		return i+1;
	}
}
