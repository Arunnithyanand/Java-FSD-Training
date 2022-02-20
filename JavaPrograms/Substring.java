import java.io.*;
import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first string");
		String txt1=sc.nextLine();
		System.out.println("Enter the Second string");
		String txt2=sc.nextLine();
		
		int result=txt1.indexOf(txt2);
		
		if (result!=-1)
		{
			System.out.println(txt2 +" is present and its substring");
		}
		else
		{
			System.out.println(txt2 +" is Not a  substring");
		}
		

	}

}
