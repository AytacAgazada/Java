package designPattern.singletonPattern.globalGameSettingsforanArcadeGame;

public class SingletonApp {
    public static void main(String[] args) {
        GameSettings gameSettings = GameSettings.getInstance();
        gameSettings.setVolume(80);

        GameSettings another = GameSettings.getInstance();
        System.out.println(another.getVolume());
    }
}
