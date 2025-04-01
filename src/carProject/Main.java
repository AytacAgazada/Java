package server.carProject;

public class Main {
    public static void main(String[] args) {
        Speed bmw = new BMW(165);
        BMW bmw2 = new BMW(182);
        Vehicle bmw3 = new Vehicle("Bmw","black");
        bmw2.autoCloseable();
        bmw2.run();

        if (bmw instanceof BMW){
            System.out.println("Related instance of BMW");
        }
        if (bmw instanceof Speed) {
            System.out.println("Related instance of Vehicle");
        }
    }
}
