//8.Insertion Sort

import java.util.*;

public class InsertionSort {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sortInsertion(arr,n);
		for(int k=0;k<n;k++)
		{
			System.out.print(arr[k]+",");
		} 
	}
	public static void sortInsertion(int arr[],int n)
	{
		int current=0,j=0;
		for(int i=0;i<n;i++)
		{
			current=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>current)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}

	}

}