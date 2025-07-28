package classPractice.multiThreading_tasks;

class MyThread extends Thread {

	 public void run() {
	     try {
	         System.out.println("Thread is running...");
	         Thread.sleep(2000);
	     } catch (InterruptedException e) {
	         System.out.println("Thread interrupted: " + e.getMessage());
	     }
	 }
}

public class Task4_IsAlive {
	 public static void main(String[] args) {
	     MyThread thread = new MyThread();
	
	     System.out.println("Before start(): " + thread.isAlive());
	
	     thread.start();
	     System.out.println("After start(): " + thread.isAlive());
	
	     try {
	         thread.join();
	     } catch (InterruptedException e) {
	         System.out.println("Main thread interrupted: " + e.getMessage());
	     }
	
	     System.out.println("After join(): " + thread.isAlive());
	 }
}

