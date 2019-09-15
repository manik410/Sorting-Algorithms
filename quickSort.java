package sorting;
import java.util.*;
public class quickSort
{
	//This function takes the last element as pivot,places the pivot element at its corerct position
	//in sorted array and places all smaller(smaller than pivot) to left of pivot and all greater
	//elements to right of pivot.
	 int partition(int[] arr,int low,int high)
	 {
		 int pivot=arr[high];
		 int i=(low-1);//index of smaller element
		 for(int j=low;j<high;j++)
		 {
			 //if current element is smaller than the pivot
			 if(arr[j]<pivot)
			 {
				 i=i+1;
				 //swap arr[i] and arr[j]
				 int tem=arr[i];
				 arr[i]=arr[j];
				 arr[j]=tem;
			 }
		 }
		 //swap arr[i+1] and arr[high] (or pivot)
		 int temp=arr[i+1];
		 arr[i+1]=arr[high];
		 arr[high]=temp;
		 return i+1;
	 }
	 //The main function that implements quick sort
	 //arr[]->array to be sorted.
	 //low->starting index
	 //high->ending index
	 void sort(int[] arr,int low,int high)
	 {
		 if(low<high)
		 {
			 //pi is partioning index arr[pi] is now at right place
			 int pi=partition(arr,low,high);
			 //recursively sort elements before partititon and after partition
			 sort(arr,low,pi-1);
			 sort(arr,pi+1,high);
		 }
	 }
	
	 void print(int[] arr)
	 {
		 int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	 }
	public static void main(String args[])
	{
		System.out.println("Enter the size of the array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		quickSort b=new quickSort();
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n=arr.length;
		b.sort(arr,0,n-1);
		b.print(arr);
	}

}
