import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) throws IOException
	{
		java.io.File file = new java.io.File("D:Sample.txt");
				Scanner input = new Scanner(file);
	       		String fileContent = "";
	       		
		        while (input.hasNext())
		        {
		
		            fileContent += input.next() + " ";
		
		        }
		
		        input.close();
	
		        char[] charArr = fileContent.toCharArray();
		
		        int counter = 0;
		
		        for(char c : charArr)
		
		        {
		
		              if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
		
		                   counter++;
		        }
	
		
		        System.out.println("Number of Vowels: " + counter);

	}

}