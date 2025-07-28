package classPractice.multiThreading_tasks;

class CounterTask1 extends Thread {
    static int counter = 0;

    public void run() 
    {
        for (int i = 0; i < 1000; i++) {
            synchronized (CounterTask1.class) {
				counter++;
			}
        }
    }
}

public class Task7_Counter_With_Synchronization {
	 public static void main(String[] args) {
	     CounterTask1 t1 = new CounterTask1();
	     CounterTask1 t2 = new CounterTask1();
	
	     t1.start();
	     t2.start();
	
	     try {
	         t1.join();
	         t2.join();
	     } catch (InterruptedException ex) {
	         System.out.println("Main thread interrupted: " + ex.getMessage());
	     }
	
	     System.out.println("Final Counter Value: " + CounterTask1.counter);
	 }
}

