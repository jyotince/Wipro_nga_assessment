package classPractice;

abstract class Shape1
{
	abstract double area();
}

class Circle1 extends Shape1{
	
	double radius;
	public Circle1(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	public double area()
	{
		return 3.14 * radius * radius;
	}
}

class Rectangle2 extends Shape1{
	
	double l,b;
	
	public Rectangle2(double l, double b) {
		// TODO Auto-generated constructor stub
		this.l = l;
		this.b = b;
	}
	
	public double area()
	{
		return l* b;
	}
}

public class Day4_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape cir = new Circle(12);
		System.out.println("Area of Circle is: "+ cir.area());
		
		Shape rect = new Rectangle(6, 8);
		System.out.println("Area of Rectangle: "+ rect.area());

	}

}
