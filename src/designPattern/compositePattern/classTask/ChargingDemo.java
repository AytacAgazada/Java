package designPattern.compositePattern.classTask;

public class ChargingDemo {
    public static void main(String[] args) {
        Tablet tablet = new Tablet();
        Camera camera = new Camera();

        DeviceCharger tabletCharge = new TabletAdapter(tablet);
        DeviceCharger cameraCharge = new CameraAdapter(camera);

        MultiChargerAdapter multiChargerAdapter = new MultiChargerAdapter();
        multiChargerAdapter.addCharge(tabletCharge);
        multiChargerAdapter.addCharge(cameraCharge);

        System.out.println("Charging individual devices:");
        tabletCharge.charge();
        cameraCharge.charge();

        System.out.println("\nCharging all devices with multi-charger:");
        multiChargerAdapter.charge();
    }
}
