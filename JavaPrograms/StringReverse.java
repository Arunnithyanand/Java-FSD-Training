//1.	Write a Java Program to reverse a string without using String inbuilt function reverse ().

import java.io.*;
import java.lang.*;
import java.util.Scanner;


public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String temp=" ";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			temp=ch+temp;
		}
		System.out.println("Reversed String is:" +temp);
		
	}

}
