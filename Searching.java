package search;

import java.util.*;
public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob= new Scanner(System.in);
	    System.out.print("Enter Size of array:");
		int n=ob.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter 1 for Linear search or 2 for binary search");
		int input = ob.nextInt();
		if(input == 2 )
			System.out.println("Enter the elements in sorted ");
		else
			System.out.println("\nEnter the elements ");
		
		for(int i=0;i<n;i++)
			arr[i]=ob.nextInt();
		Search s=new Search();
		
		System.out.println("Enter elements to be seached:");
		int ele=ob.nextInt();
		
		if(input == 2) {
			int result_bs = s.binarySearch(arr,0,n-1,ele);
			if(result_bs != -1)
				System.out.println("The element is found at index is "+ result_bs);
			else
				System.out.println("Not found");
		}else {
			int index=s.elementSearch(arr,ele,n);
			
			if(index!=-1)
				System.out.println("\nThe element is at location "+ (index+1));
			else
				System.out.println("\nElement not found");
		}
			 
		ob.close();
	}

}
class Search
{
	int elementSearch(int A[],int ele,int s) //linear search
	{
		int find=-1;
		for(int i=0;i<s;i++)
			if(A[i]==ele)
			{
				find=i;
				break;
			}
		return find;
	}
	int binarySearch(int a[],int l,int h,int ele)
	{
		if(h>=l)
		{
			int mid=l+(h-l)/2;
			if(a[mid]==ele)
				return mid;
			else if(a[mid]>ele)
				return  binarySearch(a,l,mid-1,ele);
			else
				return binarySearch(a,mid+1,h,ele);
		}
		return -1;
	}
}

