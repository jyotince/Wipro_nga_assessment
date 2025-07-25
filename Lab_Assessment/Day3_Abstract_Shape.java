package classPractice;

abstract class Shape
{
	abstract double area();
}


class Circle extends Shape
{
	double r;
	Circle(double r){
		this.r = r;
	}
	
	double area()
	{
		return 3.14*r*r;
	}
}

class Rectangle extends Shape
{
	double l;
	double b;
	Rectangle(double l, double b){
		this.l = l;
		this.b = b;
	}
	
	double area()
	{
		return l*b;
	}
}



public class Day3_Abstract_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape circle = new Circle(4);
		System.out.println("Area of Circle: "+ circle.area());
		
		Shape rect = new Rectangle(2, 3);
		System.out.println("Area of Rectangle: "+ rect.area());

	}

}
