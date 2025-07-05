package Baiscs_of_muultithreading_2;

import java.util.concurrent.*;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable is running");
    }
}

class MyCallable implements Callable<String> {
    public String call() {
        return "Callable result";
    }
}

public class Question1 {
    public static void main(String[] args) throws Exception {
        MyRunnable runnableTask = new MyRunnable();
        Thread thread = new Thread(runnableTask);
        thread.start();

        MyCallable callableTask = new MyCallable();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(callableTask);

        String result = future.get();
        System.out.println("Callable returned: " + result);

        executor.shutdown();
    }
}
