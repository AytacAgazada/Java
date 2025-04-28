package thread.kitchenCookingSimulation;

public class KitchenCookingSimulation {
    public static void main(String[] args) {
        Thread cookAlice = new Thread(new Cook("Alice"));
        Thread cookBob = new Thread(new Cook("Bob"));

        cookAlice.start();
        cookBob.start();

        try {
            while (cookAlice.isAlive() || cookBob.isAlive()) {
                System.out.println("[Checking states] Alice: " + cookAlice.getState() + ", Bob: " + cookBob.getState());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("🍽️ All dishes are ready!");
    }
}
