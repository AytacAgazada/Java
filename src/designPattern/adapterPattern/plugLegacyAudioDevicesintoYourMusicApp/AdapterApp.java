package designPattern.adapterPattern.plugLegacyAudioDevicesintoYourMusicApp;

public class AdapterApp {
    public static void main(String[] args) {
        OldHeadphones device = new OldHeadphones();
        SmartAudioDevice adapter = new LegacyAudioAdapter(device);
        adapter.connect();
    }

}
