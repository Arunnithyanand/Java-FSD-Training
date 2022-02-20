//13.	Write a java program to implement method overriding.

import java.io.*;

public class MethodOveriding {
	public static void main(String[] args) {
	       son s=new son();
			
			s.mobile();
			s.car();
			s.home();

		}
}

	
	class Father {
		
		static public void home()
		{
			System.out.println("Fathers home");
		}
		static void car()
		{
			System.out.println("Fathers car");
		}
	}
	class son extends Father{
		static void car() {   //son override car()
			System.out.println("Son's car");
		}
			
			static public void mobile()
			{
				System.out.println("Son's mobile");
			}
			}