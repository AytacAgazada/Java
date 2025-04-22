package weatherForecastApp;

public class WeatherData {
    private String city;
    private double temperature;
    private String condition;

    public WeatherData(String city, double temperature, String condition) {
        this.city = city;
        this.temperature = temperature;
        this.condition = condition;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "📍 " + city + " → 🌡️ " + temperature + "°C, ☁️ " + condition;
    }

}
