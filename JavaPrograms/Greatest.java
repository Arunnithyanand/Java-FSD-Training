package greatestglobal;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Greatest
{
	static int number1,number2;
	
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	int largest;
	System.out.print("Enter the first number");
	number1=scan.nextInt();
	System.out.print("Enter the second number");
	number2=scan.nextInt();
	if(number1>number2)
		largest=number1;
	else
		largest=number2;
	System.out.print("Largest number is" +largest);
	}	
	
}
