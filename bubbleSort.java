package sorting;
import java.util.*;
public class bubbleSort
{
	 void sort(int[] arr)
	{
		int i,j;
		int n=arr.length;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
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
		bubbleSort b=new bubbleSort();
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		b.sort(arr);
		b.print(arr);
	}

}
