package garbageCalling;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        SuperClass obj = new Service("GC Example");
//        obj.showInfo();
//        obj = null;
//        System.gc();
//        Thread.sleep(1000);
//        System.out.println("End of program");

        callServices();

        System.gc();
        Thread.sleep(1000);

        System.out.println("Operation is finished");
    }


    public static void callServices() {
        SuperClass service = new Service("Service");
        SuperClass service2 = new Service2("Service2");

        service.showInfo();
        service2.showInfo();
    }
}
