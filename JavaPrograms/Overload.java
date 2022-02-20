import java.io.*;
import java.lang.*;

public class Overload {

	public void print(int num) {
		System.out.println("1st print method");
		System.out.println("int: "+num);
		
	}
	public void print(double num) {
		System.out.println("2nd print method");
		System.out.println("double: "+num);
		
	}
	
	public void print(String text) {
		System.out.println("3rd print method");
		System.out.println("String: "+text);
		
	}
	public void print(int num1 , int num2) {
		System.out.println("4th print method");
		System.out.println("int: "+num1 + "int:" +num2);
		
	}
	public class main{
		public static void main(String[]args) {
			Overload object1=new Overload();
			object1.print("5,2");
			
		}
	}
}
