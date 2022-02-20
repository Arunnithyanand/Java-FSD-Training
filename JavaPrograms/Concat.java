//26.	Write programs to depict the usage of contains (), length (), replace (), concat (), equals ()


import java.io.*;
import java.util.*;

public class Concat {

                public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);

         System.out.println("input the string");

         String str=sc.nextLine();

         System.out.println("contains exaple" );

         if(str.contains("ing"))

                                {

                         System.out.println("String "+str+" contains ing");

                                }

         else {

                     System.out.println("String "+str+" does not contains ing");

               }

         System.out.println("");

         System.out.println("equals example");

         System.out.println("input a string");

         String str2=sc.nextLine();

         if(str.equals(str2))

         {

                System.out.println("Both are equal same string");

         }

         else {

               System.out.println("Both are different string");

         }

         System.out.println("");

         System.out.println("length example");

         System.out.println("length of the string str is"+str.length());

         System.out.println("");

         System.out.println("concat example");

         System.out.println("string after concatinating "+str+" and "+str2+" is "+str.concat(str2));

         System.out.println("");

         System.out.println("replace example");

         str.replace(str,str2);

         System.out.println(str);

                }

}