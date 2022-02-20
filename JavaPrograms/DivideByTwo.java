//16.	Write a java program to take input of integer array elements from the user and divide each element by the smallest element of the array and store the result in a resultant array. Implement Try- 
//catch-finally block to counter null pointer divide by zero error.

import java.util.Arrays;
import java.util.Scanner;

public class DivideByTwo {

	public static void main(String[] args) {
try
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		int ar1[] =new int[size];
		int arcpy[]=new int[size];
		int Res[]=new int[size];
		
		System.out.println("Enter the elements in the array");
		for (int i=0;i<size;i++)
		{
			ar1[i]=sc.nextInt();
		}
		for (int i=0;i<size;i++)
		{
			arcpy[i]=ar1[i];
		}
		int temp;
		for(int i=0;i<size;i++)
			{
				for(int j=i+1;j<size;j++)
				{
					if(ar1[i]>ar1[j])
					{
						temp=ar1[i];
						ar1[i]=ar1[j];
						ar1[j]=temp;
					}
				}
			}
		
		int small=ar1[0];
		
		for(int i=0;i<size;i++)
		{
		Res[i]=arcpy[i]/small;
		}
		
		System.out.println("The resultant array is  ");
		System.out.println(Arrays.toString(Res));
		sc.close();
	}
catch(NullPointerException e)
	{
	System.out.println("Null Pointer Exception Caught");
	}
	
catch(ArithmeticException e)
	{
	System.out.println("Null Pointer Exception Caught");
	}
finally
{
	System.out.println("Finally block is executed");
	
}}}