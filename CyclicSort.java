import java.util.*;

class CyclicSort {
	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 1, 4 };
		cyclicsort(arr);
	}

	static void cyclicsort(int arr[]) {
		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				int temp = arr[i];
				arr[i] = arr[correct];
				arr[correct] = temp;
			} else
				i++;
		}
		System.out.println(Arrays.toString(arr));
	}
}