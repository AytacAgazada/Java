package thread.kitchenCookingSimulation;
import java.util.*;
public class Cook extends Thread{
    private String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public void run(){
     try {
         for (int i =1; i <= 3; i++){
             System.out.println("Cook " + name + " is preparing dish " + i + "...");
             Random rand = new Random();
             int cookTime = rand.nextInt(3000) + 1000;
             Thread.sleep(cookTime);
         }
         System.out.println("Cook " + name + " finished cooking!");

     } catch (InterruptedException e) {
         e.printStackTrace();
     }
    }
}
