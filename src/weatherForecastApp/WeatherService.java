package weatherForecastApp;

import java.util.*;

public class WeatherService {
    private HashMap<String, WeatherData> hashMap = new HashMap<>();
    private LinkedHashMap<String, WeatherData> linkedHashMap = new LinkedHashMap<>();
    private TreeMap<String, WeatherData> treeMap = new TreeMap<>();
    private Random random = new Random();

    public void addCity(String city, double temp, String condition) {
        WeatherData data = new WeatherData(city, temp, condition);
        hashMap.put(city, data);
        linkedHashMap.put(city, data);
        treeMap.put(city, data);
        System.out.println("✅ Şəhər əlavə edildi: " + data);
    }

    public void updateCity(String city, double temp, String condition) {
        if (hashMap.containsKey(city)) {
            hashMap.get(city).setTemperature(temp);
            hashMap.get(city).setCondition(condition);
            linkedHashMap.get(city).setTemperature(temp);
            linkedHashMap.get(city).setCondition(condition);
            treeMap.get(city).setTemperature(temp);
            treeMap.get(city).setCondition(condition);
            System.out.println("✏️ Yenilənmiş şəhər: " + city + " → 🌡️ " + temp + "°C, ☁️ " + condition);
        } else {
            System.out.println("⚠️ Şəhər tapılmadı: " + city);
        }
    }

    public void printMaps() {
        System.out.println("\n==============================");
        System.out.println("🗂️ HashMap (Sırasız Məlumatlar):");
        System.out.println("------------------------------");
        hashMap.values().forEach(System.out::println);

        System.out.println("\n🗃️ LinkedHashMap (Əlavə Edilmə Sırası):");
        System.out.println("------------------------------");
        linkedHashMap.values().forEach(System.out::println);

        System.out.println("\n📚 TreeMap (Əlifba Sırası):");
        System.out.println("------------------------------");
        treeMap.values().forEach(System.out::println);
        System.out.println("==============================\n");
    }

    public void searchCitiesByPrefix(String prefix) {
        System.out.println("🔍 Prefikslə axtarış: '" + prefix + "' ilə başlayan şəhərlər");
        System.out.println("------------------------------");
        for (String city : treeMap.keySet()) {
            if (city.toLowerCase().startsWith(prefix.toLowerCase())) {
                System.out.println(treeMap.get(city));
            }
        }
        System.out.println("==============================\n");
    }

    public void randomUpdate() {
        List<String> cities = new ArrayList<>(hashMap.keySet());
        if (cities.isEmpty()) return;

        String city = cities.get(random.nextInt(cities.size()));
        double newTemp = 10 + random.nextInt(25);
        String[] conditions = {"Sunny", "Rainy", "Cloudy", "Windy"};
        String newCondition = conditions[random.nextInt(conditions.length)];
        updateCity(city, newTemp, newCondition);

        System.out.println("⚡ Təsadüfi yeniləmə tətbiq olundu!");
    }
}




