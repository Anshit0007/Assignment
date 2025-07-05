package Baiscs_of_muultithreading_2;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class SharedResource {
    final Lock lock = new ReentrantLock();

    void safeMethod(SharedResource other, String resourceName1, String resourceName2) {
        boolean myLock = false;
        boolean otherLock = false;

        try {
            myLock = this.lock.tryLock(500, TimeUnit.MILLISECONDS);
            if (myLock) {
                System.out.println(Thread.currentThread().getName() + " locked " + resourceName1);

                Thread.sleep(100); // simulate some work

                otherLock = other.lock.tryLock(500, TimeUnit.MILLISECONDS);
                if (otherLock) {
                    System.out.println(Thread.currentThread().getName() + " locked " + resourceName2);
                } else {
                    System.out.println(Thread.currentThread().getName() + " could not lock " + resourceName2);
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not lock " + resourceName1);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            if (otherLock) other.lock.unlock();
            if (myLock) this.lock.unlock();
        }
    }
}


public class Question2 {
    public static void main(String[] args) {
        SharedResource resource1 = new SharedResource();
        SharedResource resource2 = new SharedResource();

        Thread t1 = new Thread(() -> {
            resource1.safeMethod(resource2, "resource A", "resource B");
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            resource2.safeMethod(resource1, "resource B", "resource A");
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}
