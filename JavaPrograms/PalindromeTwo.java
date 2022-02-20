import java.util.*;
import java.io.*;

public class PalindromeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orginal,reverse=" ";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to check");
		orginal=in.nextLine();
		int length=orginal.length();
		for(int i=length -1 ; i>=0;i--)
			reverse=reverse + orginal.length();
			if(orginal.equals(reverse))
				System.out.println("Entered String is a palindrome");
			else
				System.out.println("Entered String is not a palindrome");

	}

}
