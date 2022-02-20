import java.io.*;
import java.util.Scanner;
 
class UserDefined extends Exception
{
    String str;
    UserDefined(String str)
    {
        this.str=str;
    }
    public String toString()
    {
        return str;
    }
}
public class Userdefine
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number:");
        int a=s.nextInt();
        try
        {
            if(a<0)
            {
                throw new UserDefined("Invalid Number");
            }
            System.out.println("Number Accepted");
        }
        catch(UserDefined e)
        {
            System.out.println(e);
        }
    }
}