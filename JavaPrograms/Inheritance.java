//27.	Create an inheritance class. (Super class as Vehicle and 2 subclasses Car and Bike and inherit the Vehicle class methods)

import java.lang.*;
import java.io.*;

class Vehicle {
    public void type() { 
     System.out.println("Vehicle engine"); 
     }
}
 class Amaze extends Vehicle{
    public void run() {
     System.out.println("Car runs with diesel engine "); 
     }
}
 class Bike extends Vehicle {
    public void Bikerun() { 
     System.out.println("Bike runs with petrol engine"); 
     }
}
 public class Inheritance {
 public static void main(String[] args) {
  
  Amaze obj1 = new Amaze();
       
  Bike obj2 = new Bike();
  		obj1.type();
  		obj1.run();
  		obj2.type();
        obj2.Bikerun();
        
        }    
 }