import java.io.*;
import java.util.*;
public class AscCode {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no: characters");
		
		int  num=sc.nextInt();
		char[] arr1=new char[num];
		System.out.println("Enter the characters to the array");
		for(int i=0;i<num;i++)
		{
			arr1[i] = sc.next().charAt(0);
		}
		System.out.println("ASCII Value of Characters");
		for (int i=0;i<num;i++)
		{
			int ascii=arr1[i];
			System.out.println(ascii+",");
		}
	}

}
