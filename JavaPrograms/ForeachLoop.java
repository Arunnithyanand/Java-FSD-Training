//21.	Create an array of 10 elements and print them using the for each loop

import java.util.Scanner;

public class ForeachLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		System.out.println("Enter the array Elements");
		 for(int i=0;i<n;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 
		 for(int num:arr)
		 {
			 System.out.print(num+" ");
		 }

	}

}