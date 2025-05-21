package designPattern.singletonPattern.classTask;

public class UserPreferences {
    private static UserPreferences instance;

    private String language;

    private UserPreferences() {
        this.language = "English";
    }

    public static UserPreferences getInstance() {
        if (instance == null) {
            instance = new UserPreferences();
        }
        return instance;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}

