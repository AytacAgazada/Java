package designPattern.compositePattern.classTask;

public class CameraAdapter implements DeviceCharger{
    private Camera camera;

    public CameraAdapter(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void charge(){
        camera.cameraCharge();
    }
}
