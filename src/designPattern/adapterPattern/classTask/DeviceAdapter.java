package designPattern.adapterPattern.classTask;

public class DeviceAdapter implements UniversalDevice {
    private OldDevice oldDevice;

    public DeviceAdapter(OldDevice oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void connect() {
        oldDevice.oldConnect();
    }
}
