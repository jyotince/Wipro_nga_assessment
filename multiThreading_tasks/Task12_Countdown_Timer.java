package classPractice.multiThreading_tasks;

public class Task12_Countdown_Timer extends Thread { 
	public void run() { 
	for(int i = 10; i >= 1; i--) { 
		System.out.println("Countdown: " + i); 
		try { 
			Thread.sleep(1000); 
		} catch(Exception ex) {} 
		} 
		System.out.println("Time’s up!"); 
	} 
	public static void main(String[] args) { 
		new Task12_Countdown_Timer().start(); 
	} 
}
