package server.job;

public class Main {
    public static void main(String[] args) {
        Manager employes = new Manager("Aysel","IT",5000,17,"Manager");
        Worker employes2 = new Worker("Aysu","IT",7500,35,16);
        employes.work();
        employes.lead();
        employes2.work();
        employes2.lead();
        employes2.calculator();
        Manager manager = new Manager("Alice", "IT", 5000, 2, "Team Lead");
        System.out.println(manager.sum(2, 3));
        System.out.println(manager.sum(2, 3, 4));
        System.out.println(manager.sum(2.4, 3.5));
        System.out.println(manager.sum(2, 3, 1.4));

    }
}
