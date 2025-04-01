package garbageCalling;

public class Service extends SuperClass {
    public Service(String name) {
        super(name);
    }

   @Override
    public void showInfo(){
       System.out.println("Overriden by Service");
   }
}
