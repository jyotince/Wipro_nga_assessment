package classPractice;

abstract class Appliance{
	abstract void turnOn();
}

interface Connectable
{
	void connect();
}

class SmartTV extends Appliance implements Connectable
{
	public void turnOn() {
		System.out.println("Tv Turned On...");
	}
	
	public void connect()
	{
		System.out.println("Tv successfully connected...");
	}
	
}
public class Day3_Task8 {
	public static void main(String[] args) {
		SmartTV tv = new SmartTV();
		tv.turnOn();
		tv.connect();
		
	}

}
