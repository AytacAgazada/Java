package thread.raceBetweenTwoStudents;
import java.util.Random;

public class StudentB extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("StudentB: Starting homework...");
            Random rand = new Random();
            int workTime = rand.nextInt(5000) + 1000;  // Random sleep time between 1 and 5 seconds
            Thread.sleep(workTime);
            System.out.println("StudentB: Finished homework!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
