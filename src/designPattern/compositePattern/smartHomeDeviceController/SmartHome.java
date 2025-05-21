package designPattern.compositePattern.smartHomeDeviceController;

public class SmartHome {
    public static void main(String[] args) {
        DeviceGroup livingRoom = new DeviceGroup();
        LightBulb lightBulb = new LightBulb();
        Thermostat thermostat = new Thermostat();

        livingRoom.addDevice(lightBulb);
        livingRoom.addDevice(thermostat);
        livingRoom.turnOn();
    }
}
