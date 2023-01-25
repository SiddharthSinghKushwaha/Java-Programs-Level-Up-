package problem_list;
import java.util.*;
class Time implements Comparable<Time>{
	int start;
	int end;
	public Time(int s, int e) {
		start = s;
		end = e;
	}
	@Override
	public int compareTo(Time o) {
		return this.end-o.end;
	}
	
}
public class ActivitySelectionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter number of activity: ");
		int n = ob.nextInt();	//to store size of the array
		Time[] arr = new Time[n];
		for(int i = 0; i<n; i++) {
			int start = ob.nextInt();
			int end = ob.nextInt();
			arr[i] =new Time(start, end);
		}
		System.out.print("\nThe maximum number of activities is "+ activity(arr));
		ob.close();
	}
	public static int activity(Time[] arr) {
		Arrays.sort(arr);
		int count = 1, j = 0;
		System.out.print("The sequence in which the activities will occur\n a1--> ");
		for(int i=0; i< arr.length; i++) {
			if(arr[i].start >= arr[j].end) {
				count++;
				System.out.print("a"+ (i+1) + "--> ");
				j = i;
			}
		}
		return count;
	}
}
