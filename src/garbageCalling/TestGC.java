package garbageCalling;

public class TestGC {
    private String name;

    public TestGC(String name) {
        this.name = name;
        System.out.println("Object " + name + " created");
    }

    @Override
    protected void finalize(){
        System.out.println("Object " + name + " is garbage collected");
    }

}
