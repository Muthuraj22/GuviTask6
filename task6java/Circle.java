package task6java;

public class Circle {
	private double radius;
	
	public Circle() {
		this.radius = 2;
	}
	
	 public Circle(double radius) {
		 this.radius = radius;
		 
	 }
	
	 public double CalculateCircum() {
		 return 2*Math.PI*radius;
	 }
	 
	 public double getRadius() {
		 return radius;
	 }



public static void main(String[] args) {
	
	//Using NO argument constructor
	Circle circle1 = new Circle();
	
	System.out.println("Circle Radius: ");
	System.out.println("Radius: "+circle1.getRadius());
	System.out.println("Circumference: "+circle1.CalculateCircum());
	
	//Using Argument constructor
	Circle circle2 = new Circle(10);
	
	System.out.println("Circle Radius: ");
	System.out.println("Radius: " +circle2.getRadius());
	System.out.println("Circumferencce: "+circle2.CalculateCircum());
}
}