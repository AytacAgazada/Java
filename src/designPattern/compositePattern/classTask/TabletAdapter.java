package designPattern.compositePattern.classTask;

public class TabletAdapter implements DeviceCharger{
    private Tablet tablet;

    public TabletAdapter(Tablet tablet) {
        this.tablet = tablet;
    }

    @Override
    public void charge() {
        tablet.tabletCharge();
    }
}
