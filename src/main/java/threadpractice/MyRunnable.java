package threadpractice;

public class MyRunnable implements Runnable {
    private String sampleThreadName;

    public MyRunnable(String sampleThreadName) {
        this.sampleThreadName = sampleThreadName;
    }
    @Override
    public void run() {
        for (int i=1; i<=5; i++) {
            System.out.println(sampleThreadName + " - Count: " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(sampleThreadName + " was interrupted.");
            }
        }
        System.out.println(sampleThreadName + " has finished wxecuting.");
    }
}
