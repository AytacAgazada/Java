package thread;

public class Main extends Thread {
    public static int count = 0 ;
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "Running " + i + " Time");
        }
    }
    public static void main(String[] args) throws Exception {
        //task 1

//        Runnable runnable = () -> System.out.println("Hello from : " + Thread.currentThread().getName());
//        new Thread(runnable).start();
//        new Thread(runnable).start();

        //task 2

//        Thread t = new Thread(() -> {
//            try {
//                Thread.sleep(1000); // TIMED_WAITING
//            } catch (InterruptedException e) {}
//        });
//
//        System.out.println(t.getState()); // NEW
//        t.start();
//        Thread.sleep(10);
//        System.out.println(t.getState());


        //task 3

       new Main().start();

        //task 4

//        Runnable runnable = () -> {
//            count++;
//            System.out.println("Runnable is - " +count);
//        };
//        new Thread(runnable).start();
//        new Thread(runnable).start();
//        new Thread(runnable).start();
//        new Thread(runnable).start();
//        new Thread(runnable).start();
//        new Thread(runnable).start();
//        new Thread(runnable).start();

        //task 5

//        Runnable runnable = () -> System.out.println(Thread.currentThread().getName() + " .......");
//        Thread t = new Thread(runnable);
//        t.start();
//        t.start(); // Each created thread is considered as a separate thread and start() is given once.

        //task 6

        Runnable car = () -> {
            for (int i = 1; i < 7; i++ ){
                System.out.println(Thread.currentThread().getName() + " version " + i);
            }
        };

        new Thread(car,"BMW").start();
        new Thread(car,"Mercedes").start();






    }
}
