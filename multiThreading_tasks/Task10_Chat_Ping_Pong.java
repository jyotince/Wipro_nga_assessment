package classPractice.multiThreading_tasks;

class Chat {
    boolean senderTurn = true;

    public synchronized void send(String msg) {
        while (!senderTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sender: " + msg);
        senderTurn = false;
        notify();
    }

    public synchronized void receive(String msg) {
        while (senderTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Receiver: " + msg);
        senderTurn = true;
        notify();
    }
}

class Sender extends Thread {
    Chat chat;
    String[] messages = { "Hi!", "How are you?", "I am doing fine.", "Bye!" };

    public Sender(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        for (String msg : messages) {
            chat.send(msg);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Receiver extends Thread {
    Chat chat;
    String[] replies = { "Hello!", "I’m fine.", "Great to hear!", "See you!" };

    public Receiver(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        for (String msg : replies) {
            chat.receive(msg);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Task10_Chat_Ping_Pong {
    public static void main(String[] args) {
        Chat chat = new Chat();
        new Sender(chat).start();
        new Receiver(chat).start();
    }
}
