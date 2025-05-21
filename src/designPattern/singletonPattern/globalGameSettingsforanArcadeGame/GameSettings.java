package designPattern.singletonPattern.globalGameSettingsforanArcadeGame;

public class GameSettings {
    private static GameSettings instance;

    private int volume;
    private int brightness;

    public GameSettings() {
        this.volume =40;
        this.brightness = 50;
    }

    public static GameSettings getInstance() {
        if (instance == null) {
            instance = new GameSettings();
        }
        return instance;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
