package threadpractice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {

        // runing MyRunnable
        Thread thread_01 = new Thread(new MyRunnable("Thread 1"));
        Thread thread_02 = new Thread(new MyRunnable("Thread 2"));

        thread_01.start();
        thread_02.start();


        // runing MyCallable
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new MyCallable());

        try {
            String result = future.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
