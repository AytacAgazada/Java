package thread.raceBetweenTwoStudents;
import java.util.Random;

public class StudentA extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("StudentA: Starting homework...");
            Random rand = new Random();
            int workTime = rand.nextInt(5000) + 1000;  // Random sleep time between 1 and 5 seconds
            Thread.sleep(workTime);
            System.out.println("StudentA: Finished homework!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
