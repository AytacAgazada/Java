package garbageCalling;

public class GarbageCallingDemo {
    public static void createObject() throws InterruptedException {
        TestGC object = new TestGC("Temporary");
        System.out.println("Exiting method, object should go out of scope");


        object = null;

        System.gc();
        Thread.sleep(1000);

    }

    public static void main(String[] args) {
        try {
            createObject();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End of program");
    }
}
