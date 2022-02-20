//11.	Write a java program to achieve 100% abstraction.


interface Cat
	{
		void cry();
		void run();
	}
	
	class BabbyCat implements Cat
	{
		public void cry() 
		{
			System.out.println("BabbyCat is crying");
		}
		public void run() 
		{
			System.out.println("BabbyCat is running");
		}
	}
	
	public class Abstraction {

	public static void main(String[] args) {
		
		Cat obj = new BabbyCat();
		obj.cry();
		obj.run();

	}

}