package classPractice;

interface RemoteControl
{
	abstract void turnOn();
	default void batteryStatus()
	{
		System.out.println("Battery status: 30%");
	}
}

class TV implements RemoteControl
{
	public void turnOn()
	{
		System.out.println("TV turned On...");
	}
	
}

public class Day4_Interface_tAsk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV t1 = new TV();
		t1.turnOn();
		t1.batteryStatus();

	}

}
