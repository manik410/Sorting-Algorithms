package sortingassignment;
import java.util.*; 
public class countSwap
{
	void sort(int []arr)
	{
		int i,j;
		int count=0;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1]) 
				{
					int tem=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
					count++;
				}
			}
		}
		System.out.println("Total no of swaps "+count);
	}
	public static void main(String args[])
	{
		countSwap a=new countSwap();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int x=sc.nextInt();
		int a1[]=new int[x]; 
		for(int i=0;i<x;i++)
		{
			a1[i]=sc.nextInt();
		}
		a.sort(a1);
	}

}
