package classPractice.multiThreading_tasks;

class Buffer {
    private int item;
    private boolean hasItem = false;

    public synchronized void produce(int value) {
        while (hasItem) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        item = value;
        hasItem = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() {
        while (!hasItem) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Consumed: " + item);
        hasItem = false;
        notify();
    }
}

class Producer extends Thread {
    Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(800);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

public class Task9_Producer_Customer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
 
