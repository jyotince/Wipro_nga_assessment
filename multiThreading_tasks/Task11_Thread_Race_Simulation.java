package classPractice.multiThreading_tasks;

import java.util.Random;

class AnimalThread extends Thread {
    private String animalName;
    private Random rand = new Random();

    public AnimalThread(String name) {
        this.animalName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(animalName + ": running... " + i);
            try {
                Thread.sleep(rand.nextInt(1000)); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Task11_Thread_Race_Simulation {
    public static void main(String[] args) {
        Thread tortoise = new AnimalThread("Tortoise");
        Thread rabbit = new AnimalThread("Rabbit");
        Thread dog = new AnimalThread("Dog");

        tortoise.start();
        rabbit.start();
        dog.start();
    }
}

