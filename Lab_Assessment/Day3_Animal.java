package classPractice;

class Animal
{
	void sound()
	{
		System.out.println("Sounds like Animal...");
	}
}

class Dog extends Animal
{
	void sound()
	{
		System.out.println("Sounds like Dog...");
	}
	
}

class Cat extends Animal
{
	void sound()
	{
		System.out.println("Sounds like Cat...");
	}
}

class Cow extends Animal
{
	void sound()
	{
		System.out.println("Sounds like Cow...");
	}
}

public class Day3_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Dog(); 
		Animal a2 = new Cat();
		Animal a3 = new Cow(); 
		
		a1.sound();
		a2.sound();
		a3.sound();
	}

}
