package sorting;
import java.util.*;
public class insertionSort
{
	 void sort(int[] arr)
	{
		int i,j;
		int n=arr.length;
		for(i=1;i<n;i++)
		{
			int key=arr[i];
			j=i-1;
			while(j>=0&&arr[j]>=key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
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
		insertionSort b=new insertionSort();
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		b.sort(arr);
		b.print(arr);
	}

}
