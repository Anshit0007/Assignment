package Baiscs_of_muultithreading_2;

import java.util.concurrent.*;

public class Question5 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor1 = Executors.newFixedThreadPool(2);

        Runnable task = () -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " running " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }
        };

        for (int i = 0; i < 3; i++) {
            executor1.submit(task);
        }

        executor1.shutdown();
        executor1.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Executor 1 finished with shutdown");

        ExecutorService executor2 = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 3; i++) {
            executor2.submit(task);
        }

        executor2.shutdownNow();
        executor2.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Executor 2 finished with shutdownNow");
    }
}
