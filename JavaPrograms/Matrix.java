//6.	Write a java program to subtract two matrices. Take the input of the matrices from the user.

import java.util.*;
import java.io.*;

public class Matrix
{
  public static void main(String argu[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the row and column size :");
      int row  =sc.nextInt();
      int col  =sc.nextInt();
      int arr[][] = new int[row][col];
      int arr1[][] = new int[row][col];
      int diff[][] = new int[row][col];
      System.out.println("enter the first Matrix elements  :");
      for(int i = 0; i < row; i++){  
            for(int j = 0; j < col; j++){  
               arr[i][j] =sc.nextInt();
            }  
            System.out.println();  
        }
         System.out.println("enter the second  Matrix elements  :");
        for(int i = 0; i < row; i++)
        {  
            for(int j = 0; j < col; j++)
            {  
               arr1[i][j] =sc.nextInt();
            }  
            System.out.println();  
        }  
         for(int i = 0; i < row; i++)
         {  
            for(int j = 0; j < col; j++){  
                diff[i][j] = arr[i][j] - arr1[i][j];  
            }  
        }  
       System.out.println("The difference Matrix :");
      for(int i = 0; i < row; i++){  
            for(int j = 0; j < col; j++){  
               System.out.print(diff[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
}