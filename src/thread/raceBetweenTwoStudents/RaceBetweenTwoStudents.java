package thread.raceBetweenTwoStudents;


public class RaceBetweenTwoStudents  {
    public static void main(String[] args) {
        StudentA studentA = new StudentA();
        StudentB studentB = new StudentB();

        studentA.start();
        studentB.start();

        try {
            studentA.join();
            studentB.join();

            if (studentA.isAlive() == false && studentB.isAlive() == false) {
                System.out.println("🏆 Winner: " + (studentA.getState() == Thread.State.TERMINATED ? "StudentA" : "StudentB"));
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
