
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = {4,7,2,9,6,1,8,2};
		bsort(array);
	}
	static void bsort(int []arr) {
		int last = arr.length;
		for(int i=0; i<arr.length; i++) {
			int exchange =0;
			for(int j=0; j<last-1; j++) {
				
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					exchange++;
				}
			}
			if(exchange != 0)
				last--;
			else {
				print(arr);
				break;
			}
		}
	}
	static void print(int[] a) {
		System.out.print("The element of array is: ");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
	}

}
