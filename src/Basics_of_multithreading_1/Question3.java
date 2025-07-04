package Basics_of_multithreading_1;

class MyTask extends Thread {
    volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Thread stopped.");
    }

    public void stopRunning() {
        running = false;
    }
}

public class Question3 {
    public static void main(String[] args) throws InterruptedException {
        MyTask task = new MyTask();
        task.start();

        Thread.sleep(2000);
        task.stopRunning();
    }
}
