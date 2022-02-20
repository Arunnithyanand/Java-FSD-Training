import java.io.*;
import java.util.*;

public class FinallyBlock
{
   public static void main(String args[]) {
      try{  
	 int a=10;
	 int d=a/0;
     }
     catch(ArithmeticException e)
      {
    	 System.out.println("Division by 0..");
	 
      }  
      finally
      {
    	  System.out.println("Finally it comes home");
      }
      	System.out.println("The end");
   }   
}