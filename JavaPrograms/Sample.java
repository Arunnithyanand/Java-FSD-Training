 class FinalExmp3
{
	void run()
	{
		System.out.println("run method in Sample");
	}
}
class Sample extends FinalExmp3
{
	void run()
	{
		System.out.println("run method in FinalExmp3");
	}
	public static void main(String[] args)
	{
		Sample a=new Sample();
		a.run();
	}
}
