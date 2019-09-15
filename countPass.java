package sortingassignment;
import java.util.*; 
public class countPass
{
	void sort(int []arr)
	{
		int i,j;
		int count=0,count1=1;
		for(i=0;i<arr.length-1;i++)
		{
			count=0;
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
			if(count>0)
				count1++;
		}
			System.out.println("Total no of passes "+count1);
	}
	public static void main(String args[])
	{
		countPass a=new countPass();
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
