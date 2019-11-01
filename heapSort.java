package priorityQueue;
import java.util.*;
public class heapSort 
{
	static void heapify(int []a,int size,int i)
	{
		int largest=i;
		int left=2*i+1;
		int temp;
		int right=2*i+2;
		if(left<size&&a[left]>a[largest])
			largest=left;
		if(right<size&&a[right]>a[largest])
			largest=right;
		if(largest!=i)
		{
			temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
			heapify(a,size,largest);
		}
		
	}
	static void heapSort(int[] a,int n)
	{
		int temp;
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(a,n,i);
		}
		for(int i=n-1;i>=0;i--)
		{
			temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			heapify(a,i,0);
		}
		
	}
	public static void main(String args[])
	{
		int[] arr = {1, 10, 2, 3, 4, 1, 2, 100, 23, 2};  
		int i;
		heapSort(arr,arr.length);
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
