import java.io.*;
import java.lang.*;
class Vehicle{  
	  //method 1 
	  void run(){System.out.println("Vehicle is running");}  
	} 
class Vehicle2{  
  //method 1 
  void run(){System.out.println("Vehicle2 is running");}  
}  
//child class  
class Bike2 extends Vehicle{  
  //defining the same method as in the parent class  
  void run(){System.out.println("Bike is running safely");
  }  
  class Bike4 extends Vehicle2{  
	  //defining the same method as in the parent class  
	  void run(){System.out.println("Bike4 is running safely");
	  }  
  
  public static void main(String args[]){  
  Bike2 obj = new Bike2(); 
  Bike4 obj = new Bike4(); 
  obj.run(); 
  }  
} 
}