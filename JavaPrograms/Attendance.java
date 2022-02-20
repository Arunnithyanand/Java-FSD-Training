class Attendance
{
	void absence()
	{
		System.out.println("2 are absent");
		
	}
	void present()
	{
		System.out.println("30 are absent");
	}
class Attendance2 extends Attendance
{
	void absence()
	{
		System.out.println("3 are absent");
	}
	void present()
	{
		System.out.println("27 are present");
	}
	
	
}
public class Assignment2
{
	public static void main(String[] args)
	{
		Report1 a = new Report2();
		Attendance b=new Attendance2();
		a.subject();
		a.teacher();
		b.absence();
		b.present();
	}
}
	
}