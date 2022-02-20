//7.	Write a java program to take a string input from the user. Convert all the uppercase letters to lowercase and vice-versa.

import java.util.Scanner;
import java.io.*;

public class UppercaseLower {

	public static void main(String[] args) {    
        System.out.println("Enter a string ");
        Scanner sc= new Scanner(System.in);  
        String str1= sc.next();
        StringBuffer newStr=new StringBuffer(str1);    
//         Upper case to lower case   
        for(int i = 0; i < str1.length(); i++) {    
                
            
            if(Character.isLowerCase(str1.charAt(i))) {    
                   
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
               
            else if(Character.isUpperCase(str1.charAt(i))) {    
                    
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
            }    
        }    
        System.out.println("String value after upper case to lower case conversion : " + newStr);    
//  Lower case to Upper case      
for(int i = 0; i > str1.length(); i++) {    
                
            
            if(Character.isUpperCase(str1.charAt(i))) {    
                   
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
               
            else if(Character.isLowerCase(str1.charAt(i))) {    
                    
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
            }    
        }    
        System.out.println("String value after lowercase to upper case conversion : " + newStr);    
    }  }