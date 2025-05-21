package designPattern.adapterPattern.classTask;

public class DeviceConnector {
    public static void main(String[] args) {
        OldDevice device = new OldDevice();
        UniversalDevice adapter = new DeviceAdapter(device);
        device.oldConnect();
        adapter.connect();
    }
}
