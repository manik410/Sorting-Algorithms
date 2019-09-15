package sortingassignment;
import java.util.*;
public class sortEvenOdd
{
	void sort(int[] arr)
	{
		int i,j;
		for(i=2;i<arr.length;i++)
		{
			int temp=arr[i];
			j=i-2;
			if(i%2==1)
			{
				while(j>=0&&arr[j]<=temp)
				{
					arr[j+2]=arr[j];
					j=j-2;
				}
				arr[j+2]=temp;
			}
			else
			{
				while(j>=0&&arr[j]>=temp)
				{
					arr[j+2]=arr[j];
					j=j-2;
				}
				arr[j+2]=temp;
			}
		}
	}
	void print(int[] arr)
	{
		int i;
		int []b=new int[arr.length];
		int k=0;
		for(i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				b[k]=arr[i];
				k++;
			}
			else
			{
				b[k]=arr[i];
				k++;
			}
		}
		for(i=0;i<k;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	public static void main(String args[])
	{
		sortEvenOdd q=new sortEvenOdd();
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int[] a=new int[x];
		for(int i=0;i<x;i++)
		{
			a[i]=sc.nextInt();
		}
		q.sort(a);
		q.print(a);
	}

}
