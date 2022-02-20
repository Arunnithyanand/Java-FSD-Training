import java.util.*;
public class Employee {
	public static int CalBonus(int sal, int yr)
	{
		int bon=0;
		if(yr<=2017 && sal>30000)
		{
			bon = (sal*22)/100;
		}
		else if(yr<=2017 && sal<30000)
		{
			bon = (sal*33)/100;
		}
		else if(yr<=2012)
		{
			bon = (sal*40)/100;
		}
		else if(yr>2017 && sal<30000)
		{
			bon = (sal*15)/100;
		}
		else if(yr>2017 && sal>30000)
		{
			bon = (sal*10)/100;
		}
		return bon;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your salary: ");
		int sal1 = sc.nextInt();
		System.out.println("Enter your year of joining: ");
		int yr1 = sc.nextInt();
		int result = CalBonus(sal1,yr1);
		
		System.out.println("The Loyality Bonus of "+name+" is "+result);
	}
	

}
