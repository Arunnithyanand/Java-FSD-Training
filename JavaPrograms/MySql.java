package Mysqldatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySql
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/arundb","root","user123");
			Statement s= c.createStatement();
			ResultSet r= s.executeQuery("select * from EMPL");
			
			while(r.next())
			{
				System.out.println(r.getInt(1)+r.getString(2));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
