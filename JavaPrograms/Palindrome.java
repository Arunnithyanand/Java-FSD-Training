//3.	Write a Java Program to find whether a string or number is palindrome or not. 

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		{    
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the String: ");
	        String str=sc.nextLine();
	            
	        boolean flag = true;    
	            
	           
	        str = str.toLowerCase();    
	            
	           
	        for(int i = 0; i < str.length()/2; i++)
	        {    
	            if(str.charAt(i) != str.charAt(str.length()-i-1))
	            {    
	                flag = false;    
	                break;    
	            }    
	        }    
	        if(flag)    
	            System.out.println("Given string is palindrome");    
	        else    
	            System.out.println("Given string is not a palindrome");    
	    } 

	}

}