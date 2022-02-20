//29.	Create an abstract class and extend that class and try to create the object of the abstract class in a program and execute.

import java.io.*;
import java.lang.*;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle1 extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}

class TestAbstraction1 {
	public static void main(String args[]) {
		Shape s = new Circle1();
		s.draw();
	}
}