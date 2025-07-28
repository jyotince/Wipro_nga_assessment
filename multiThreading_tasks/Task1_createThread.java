package classPractice.multiThreading_tasks;

class Task1_createThread extends Thread {

	 public void run() {
	     try {
	         for (int i = 0; i < 5; i++) {
	             System.out.println("Hello from Thread!");
	             Thread.sleep(1000); 
	         }
	     } catch (InterruptedException e) {
	         System.out.println("Thread interrupted: " + e.getMessage());
	     }
	 }
	
	 public static void main(String[] args) {
		 Task1_createThread thread = new Task1_createThread();
	     thread.start();
	 }
}
