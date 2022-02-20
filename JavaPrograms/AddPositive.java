import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class AddPositive
{
    public static void main(String[] args)
    {
       int n;

Scanner sc =new Scanner(System.in);
System.out.println("Enter the Number of elements you whant to enter  :");
n=sc.nextInt();
int[] a= new int[n];
System.out.println("Enter the  elements :");
        for (int i = 0; i < n; i++)  
        {  
            String s = System.console().readLine();
            a[i] = Integer.parseInt(s);
        }
       
 
       int sum=0;
      for (int i = 0; i < n; i++)  
        {  
            if(a[i] >=0)
               sum=sum+a[i];

        }
    System.out.println(" sum of positive no " +sum);
    }
    }