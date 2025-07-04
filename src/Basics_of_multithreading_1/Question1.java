package Basics_of_multithreading_1;

class MyRunnable implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Runnable Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Runnable thread interrupted");
        }
    }
}

class MyThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread Class: " + i);
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread class interrupted");
        }
    }
}

public class Question1 {
    public static void main(String[] args) {
        MyRunnable runnableTask = new MyRunnable();
        Thread thread1 = new Thread(runnableTask);

        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread ends");
    }
}
