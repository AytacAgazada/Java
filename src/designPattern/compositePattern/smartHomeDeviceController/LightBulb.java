package designPattern.compositePattern.smartHomeDeviceController;

public class LightBulb implements SmartDevice{

    @Override
    public void turnOn() {
        System.out.println("LightBulb is ON");
    }
}
