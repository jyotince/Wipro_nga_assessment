package classPractice.multiThreading_tasks;

class Task2_RunnableCounter implements Runnable {
	
	 public void run() {
	     for (int i = 1; i <= 10; i++) {
	         System.out.println(i);
	         try {
	             Thread.sleep(500); // Optional: 0.5-second delay for better visibility
	         } catch (InterruptedException e) {
	             System.out.println("Thread interrupted: " + e.getMessage());
	         }
	     }
	 }
	
	 public static void main(String[] args) {
		 Task2_RunnableCounter counter = new Task2_RunnableCounter();
	     Thread thread = new Thread(counter); // Pass the Runnable to Thread
	     thread.start(); // Start the thread
	 }
}
