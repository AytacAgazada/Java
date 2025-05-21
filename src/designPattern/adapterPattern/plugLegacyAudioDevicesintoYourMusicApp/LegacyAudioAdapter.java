package designPattern.adapterPattern.plugLegacyAudioDevicesintoYourMusicApp;

public class LegacyAudioAdapter implements SmartAudioDevice{
    private OldHeadphones oldDevice;

    public LegacyAudioAdapter(OldHeadphones oldDevice) {
        this.oldDevice = oldDevice;
    }
    @Override
    public void connect() {
        oldDevice.plugIn();
    }
}
