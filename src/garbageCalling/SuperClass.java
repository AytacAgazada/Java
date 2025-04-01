package garbageCalling;

public class SuperClass{
    protected String name;

    public SuperClass(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Super object yarandi");
    }

    @Override
    protected void finalize(){
        System.out.println("SuperClass object " + name + " is garbage collected");
    }
}
