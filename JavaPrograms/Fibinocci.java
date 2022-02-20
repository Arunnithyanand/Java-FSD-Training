import java.util.*;
import java.io.*;

public class Fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the term to be printed");
		Scanner ob = new Scanner(System.in);
		int a=0;
		int b=1;
		int ch=ob.nextInt();
		for(int i=0;i<ch;i++)
		{
			System.out.println(b);
			b=a+b;
			a=b-a;
			if(i <=ch-2)
			{
				System.out.println(" , ");
			}
			if (i==ch-1)
			{
				System.out.println("\nThese are the first"     + ch + "\nFibinocci Numbers");
			}
		}
	}

}
