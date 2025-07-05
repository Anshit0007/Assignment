package Baiscs_of_muultithreading_2;

import java.util.concurrent.*;
import java.util.Random;

class RandomNumberTask implements Callable<Integer> {
    public Integer call() {
        Random random = new Random();
        return random.nextInt(100);
    }
}

public class Question4 {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new RandomNumberTask());
        Integer result = future.get();
        System.out.println("Random number: " + result);
        executor.shutdown();
    }
}
