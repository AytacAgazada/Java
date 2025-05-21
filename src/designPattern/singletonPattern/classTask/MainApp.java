package designPattern.singletonPattern.classTask;


public class MainApp {
    public static void main(String[] args) {
        UserPreferences preferences = UserPreferences.getInstance();
        System.out.println("Default language: " + preferences.getLanguage());

        preferences.setLanguage("Spanish");
        UserPreferences preferences1 = UserPreferences.getInstance();
        System.out.println("Language from second reference: " + preferences1.getLanguage());
    }
}
