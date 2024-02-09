package multithreadingTest;

import org.junit.Test;
public class DeadlockTest {

    @Test(timeout = 500) // Set a timeout to ensure the test doesn't run indefinitely
    public void testDeadlock() throws InterruptedException {
        Thread thread = new Thread(DeadlockTest::createDeadlock);
        thread.start();

        // Wait for the thread to finish or timeout
        thread.join();

        // If the test reaches this point, deadlock did not occur
    }

    private static void createDeadlock() {
    }
}
