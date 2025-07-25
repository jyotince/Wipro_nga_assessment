package classPractice;

class Vehicle{
	String brand;
	double speed;
	
	Vehicle(String brand, double speed)
	{
		this.brand = brand;
		this.speed = speed;
	}
	
	void showDetails()
	{
		System.out.println("Brand: "+ brand);
		System.out.println("Speed: "+ speed);
	}
}

class Car extends Vehicle
{
	Car(String brand, double speed)
	{
		super(brand, speed);
	}
}

class Bike extends Vehicle
{
	Bike(String brand, double speed)
	{
		super(brand, speed);
	}
}


public class Day3_VehicleSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car("Toyota", 180);
		c.showDetails();
		
		Bike b = new Bike("Apache", 120);
		b.showDetails();

	}

}
