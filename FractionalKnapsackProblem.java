package problem_list;
import java.util.*;
class Items implements Comparable<Items>{
	int w;
	int profit;
	public Items(int w, int profit) {
		this.w = w;
		this.profit = profit;
	}
	@Override
	public int compareTo(Items o) {
		return (o.profit/o.w) - (this.profit/this.w);
	}
	
}
public class FractionalKnapsackProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int n = ob.nextInt();	//number of items
		int w = ob.nextInt();	//total weight
		Items[] arr = new Items[n];
		for(int i=0; i<n; i++) {
			int weight = ob.nextInt();
			int profit = ob.nextInt();
			arr[i] = new Items(weight, profit);
		}
		System.out.println(knapsack(arr, w));
		ob.close();
	}
	public static double knapsack(Items[] arr, int weight) {
		Arrays.sort(arr);
		double p=0.0;
		for(int i=0; i<arr.length; i++) {
			if(weight >= arr[i].w) {
				p += arr[i].profit;
				weight -= arr[i].w;
			}else {
				p += ((double)weight/arr[i].w)*(arr[i].profit);
				break;
			}
		}
		return p;
		
	}

}
