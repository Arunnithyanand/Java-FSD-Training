import java.io.*;
import java.util.*;

class StringConv
	{
		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the size of the array");
				int n=sc.nextInt();
				System.out.println("Enter some integer elements to the string array");
				String[] str=new String[n];

				for(int i=0;i<n;i++)
						{
							str[i]=sc.next();
						}

				int [] arr = new int [n];
      			for(int i=0; i<n; i++) 
      					{
         					arr[i] = StackIntegersSample.parseInt(str[i]);
      					}

      			int sum=0;
      			for(int i=0;i<n;i++)
      					{
      						 sum+=arr[i];

      					}
      			System.out.println("Sum="+sum);
			}
	}