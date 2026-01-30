package background_job;

public class BackgroundJobExecution {

    public static void main(String[] args) {

        Runnable job = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Background task running: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Task interrupted");
                }
            }
        };

        Thread backgroundThread = new Thread(job);
        backgroundThread.start();

        System.out.println("Main thread continues executing...");
    }
}

