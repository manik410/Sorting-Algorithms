package sorting;
import java.util.*;
public class selectionSort
{
	 void sort(int[] arr)
	{
		int i,j;
		int n=arr.length;
		int index=0;
		for(i=0;i<n;i++)
		{
			index=i;
			for(j=i+1;j<n;j++)
			{
				if(arr[j]<arr[index])
					index=j;
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
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
		selectionSort b=new selectionSort();
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		b.sort(arr);
		b.print(arr);
	}

}
