package classPractice.multiThreading_tasks;


class NumberPrinter extends Thread {
	
	 public void run() {
	     try {
	         for (int i = 1; i <= 5; i++) {
	             System.out.println("Thread1: " + i);
	             Thread.sleep(1000);
	         }
	     } catch (InterruptedException ex) {
	         System.out.println("Thread1 interrupted: " + ex.getMessage());
	     }
	 }
}
	
public class Task3_sleep_join {
	 public static void main(String[] args) {
	     NumberPrinter thread1 = new NumberPrinter();
	     thread1.start();
	
	     try {
	         thread1.join();
	     } catch (InterruptedException ex) {
	         System.out.println("Main thread interrupted: " + ex.getMessage());
	     }
	
	     System.out.println("Main thread done.");
	 }
}

