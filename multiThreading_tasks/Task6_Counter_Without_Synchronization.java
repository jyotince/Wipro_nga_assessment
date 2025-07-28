package classPractice.multiThreading_tasks;

class CounterTask extends Thread {
	 static int counter = 0; 

	 public void run() {
	     for (int i = 0; i < 1000; i++) {
	         counter++;
	     }
	 }
}

public class Task6_Counter_Without_Synchronization {
	 public static void main(String[] args) {
	     CounterTask t1 = new CounterTask();
	     CounterTask t2 = new CounterTask();
	
	     t1.start();
	     t2.start();
	
	     try {
	         t1.join();
	         t2.join();
	     } catch (InterruptedException e) {
	         System.out.println("Main thread interrupted: " + e.getMessage());
	     }
	
	     System.out.println("Final Counter Value: " + CounterTask.counter);
	 }
}

