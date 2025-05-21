package designPattern.compositePattern.classTask;

import java.util.*;

public class MultiChargerAdapter implements DeviceCharger{
    private List<DeviceCharger> deviceChargers;

    public MultiChargerAdapter() {
        this.deviceChargers = new ArrayList<>();
    }

    public void addCharge(DeviceCharger charger){
        deviceChargers.add(charger);
    }

    @Override
    public void charge() {
        for (DeviceCharger charger : deviceChargers){
            charger.charge();
        }
    }
}
