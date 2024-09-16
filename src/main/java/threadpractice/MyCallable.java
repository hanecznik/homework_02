package threadpractice;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i=1; i<=5; i++) {
            System.out.println("Callable Thread - Count: " + i);
            Thread.sleep(10);
        }
        return "Callable Task Completed!";
    }
}
