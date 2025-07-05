package Baiscs_of_muultithreading_2;
import java.util.concurrent.*;

public class Question3 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        for (int i = 0; i < 5; i++) {
            singleThreadExecutor.submit(task);
        }
        for (int i = 0; i < 5; i++) {
            fixedThreadPool.submit(task);
        }
        for (int i = 0; i < 5; i++) {
            cachedThreadPool.submit(task);
        }

        singleThreadExecutor.shutdown();
        fixedThreadPool.shutdown();
        cachedThreadPool.shutdown();

        singleThreadExecutor.awaitTermination(5, TimeUnit.SECONDS);
        fixedThreadPool.awaitTermination(5, TimeUnit.SECONDS);
        cachedThreadPool.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("All tasks completed");
    }
}
