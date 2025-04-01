package carProject;

import java.lang.Runnable;

public class BMW extends Speed implements AutoCloseable, Runnable {

    int maxSpeed = 280;

    public BMW(int speed) {
        super(speed);
    }

    @Override
    public void autoCloseable() {
        String auto = (speed >= 180 ) ? "very speed!!!" : "good...";
        System.out.println(auto);
    }

    @Override
    public void run() {
        String run = (speed == 0) ? "The car is getting ready to fall..." : ".......";
        System.out.println(run);
    }


    @Override
    void myCarSpeed() {
        if(speed == maxSpeed){
            System.out.println("Maximum speed!");
        } else if (speed >= 180) {
            System.out.println("Reduce speed...");
        }else {
            System.out.println("great...");
        }
    }
}
