package multithreading;

public class Deadlock {

    public static void main(String[] args) {
        Object resource1 = new Object();
        Object resource2 = new Object();

        // Thread 1
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Acquired lock on resource1");

                try {
                    // Introducing delay to make deadlock more likely
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource2) {
                    System.out.println("Thread 1: Acquired lock on resource2");
                }
            }
        });

        // Thread 2
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Acquired lock on resource2");

                synchronized (resource1) {
                    System.out.println("Thread 2: Acquired lock on resource1");
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
