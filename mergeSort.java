package sorting;
import java.util.*;
public class mergeSort
{
	//merge two subarrays of arr[]
	//first subarray is arr[l..m]
	//second subarray is arr[m+1..r]
	void merge(int[] arr,int l,int m,int r)
	{
		//find the sizes of two subarrays to be merged
		int n1=m-l+1;
		int n2=r-m;
		//create temp arrays
		int L[]=new int[n1];
		int R[]=new int[n2];
		//copy data to temp arrays
		for(int i=0;i<n1;i++)
		{
			L[i]=arr[l+i];
		}
		for (int j=0;j<n2;j++)
		{
			R[j]=arr[m+1+j];
		}
		//merge the temp arrays
		//initial indexs of first and second sub array 
		int i=0,j=0;
		//initial index of merged subarray array
		int k=l;
		while(i<n1&&j<n2)
		{
			if(L[i]<=R[j])
			{
				arr[k]=L[i];
				i++;
			}
			else
			{
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		//copy remaining elements of L[] if any
		while(i<n1)
		{
			arr[k]=L[i];
			i++;
			k++;
		}
		//copy remaining elements of R[] if any
		while(j<n2)
		{
			arr[k]=R[j];
			j++;
			k++;
		}
	}
	//Main function that sorts arr[l..r] using merge function
	void sort(int[] arr,int l,int r)
	{
		if(l<r)
		{
			//find the middle point
			int m=(l+r)/2;
			//sort first and second halfs
			sort(arr,l,m);
			sort(arr,m+1,r);
			//merge the sorted halfs
			merge(arr,l,m,r);
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
		mergeSort b=new mergeSort();
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		b.sort(arr,0,arr.length-1);
		b.print(arr);
	}

}
