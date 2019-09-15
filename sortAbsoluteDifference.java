package sortingassignment;
import java.util.Scanner;
public class sortAbsoluteDifference 
{
	void sort(int a[],int value)
	{
		int i,j;
		for(i=1;i<a.length;i++)
		{
			int diff=Math.abs(a[i]-value);
			j=i-1;
			if(Math.abs(a[j]-value)>diff)
			{
				int tem=a[i];
				while(j>=0&&Math.abs(a[j]-value)>diff)
				{
					a[j+1]=a[j];
					j=j-1;
				}
				a[j+1]=tem;
			}
		}
	}
	void print(int a[])
	{
		int i,j;
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x=sc.nextInt();
		int[] a=new int[x];
		for(int i=0;i<x;i++)
		{
			a[i]=sc.nextInt();
		}
		sortAbsoluteDifference q=new sortAbsoluteDifference();
		System.out.println("Enter the value");
		int value=sc.nextInt();
		q.sort(a,value);
		q.print(a);
	}

}
