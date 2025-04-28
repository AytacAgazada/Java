package thread;

public class Bonus {
    public static void main(String[] args) throws Exception {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread1 Started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread1 Finished");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread2 Started");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread2 Finished");
        });

        System.out.println("Before start: Thread1 -> " + thread1.getState() + ", Thread2 -> " + thread2.getState());

        System.out.println("Starting threads...");
        thread1.start();
        thread2.start();

        Thread.sleep(100);
        System.out.println("After start: Thread1 -> " + thread1.getState() + ", Thread2 -> " + thread2.getState());

        Thread.sleep(500);
        System.out.println("After 500ms: Thread1 -> " + thread1.getState() + ", Thread2 -> " + thread2.getState());

        thread1.join();
        System.out.println("After joining Thread1: " + thread1.getState());

        thread2.join();
        System.out.println("After joining Thread2: " + thread2.getState());
        System.out.println("Main thread finished!");

    }
}
