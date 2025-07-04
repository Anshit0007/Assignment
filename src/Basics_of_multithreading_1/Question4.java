package Basics_of_multithreading_1;

class SharedResource {
    void methodA(SharedResource other) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " locked resource A");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

            synchronized (other) {
                System.out.println(Thread.currentThread().getName() + " locked resource B");
            }
        }
    }

    void methodB(SharedResource other) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " locked resource B");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

            synchronized (other) {
                System.out.println(Thread.currentThread().getName() + " locked resource A");
            }
        }
    }
}

public class Question4 {
    public static void main(String[] args) {
        SharedResource resource1 = new SharedResource();
        SharedResource resource2 = new SharedResource();

        Thread t1 = new Thread(() -> {
            resource1.methodA(resource2);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            resource2.methodB(resource1);
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}
