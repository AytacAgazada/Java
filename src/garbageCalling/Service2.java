package garbageCalling;

public class Service2 extends SuperClass{
    public Service2(String name) {
        super(name);
    }

    @Override
    public void showInfo(){
        System.out.println("Overriden by Service2");
    }
}
