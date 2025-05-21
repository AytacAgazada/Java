package designPattern.compositePattern.smartHomeDeviceController;

import java.util.ArrayList;
import java.util.List;

public class DeviceGroup implements SmartDevice{
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device){
        devices.add(device);
    }

    @Override
    public void turnOn() {
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }
}
