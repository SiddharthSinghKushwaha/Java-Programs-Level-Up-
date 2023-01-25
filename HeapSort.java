
public class HeapSort {
	static int heap_size;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 4, 1, 5, 6, 7};
		HeapSort h = new HeapSort(); 
		printArray(arr);
		h.heapSort(arr);
		System.out.println("\nThe sorted array is: ");
		printArray(arr);
	}
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}
	void heapSort(int[] arr) {
		build_maxHeap(arr);
		for(int i= arr.length -1; i>=1 ; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			
			heap_size--;
		    heapify(arr, 0);
		}
	}
	public static void build_maxHeap(int[] arr) {
		//building max heap 
				heap_size = arr.length;
				for(int i = arr.length/2 -1; i>=0; i--) {
					heapify(arr, i);
				}
	}
	public static void heapify(int[] arr, int i) { //satisfying the max heapify property 
			int largest = i;	//initialize largest as root
			
			int l = 2*i + 1;
			int r = 2*i + 2;
			 if (l < heap_size && arr[l] > arr[largest])
				 largest = l;
			 if (r < heap_size && arr[r] > arr[largest])
			     largest = r;
			 if (largest != i) {
			     //swap(arr[i], arr[largest]);
				 //code to swap arr[i] with arr[largest]
				 int temp = arr[i];
				 arr[i] = arr[largest];
				 arr[largest] = temp;
			     heapify(arr, largest);
			     }
	}
}