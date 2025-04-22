package weatherForecastApp;

public class CityWeatherApp {
    public static void main(String[] args) throws InterruptedException {
        WeatherService service = new WeatherService();

        System.out.println("\n🌤️ Şəhər Hava Proqnozu Sisteminə Xoş Gəlmisiniz!\n");

        service.addCity("Shaki", 12, "Rainy");
        service.addCity("Ganja", 15, "Cloudy");
        service.addCity("Baku", 18, "Sunny");
        service.addCity("Sumgait", 17, "Windy");

        service.printMaps();

        service.updateCity("Ganja", 20, "Sunny");
        service.printMaps();

        service.searchCitiesByPrefix("S");

        for (int i = 0; i < 3; i++) {
            Thread.sleep(2000); // simulate delay
            service.randomUpdate();
            service.printMaps();
        }

        System.out.println("🌈 Proqram sona çatdı. Təşəkkürlər!\n");
    }
}
