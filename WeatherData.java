import java.util.HashMap;
import java.util.Map;

public class WeatherData {
    private static final Map<String, String> weatherMap = new HashMap<>();

    static {
        weatherMap.put("New York", "Location: New York\nTemperature: 25°C\nFeels Like: 27°C\nHumidity: 60%\nDescription: Clear sky");
        weatherMap.put("Los Angeles", "Location: Los Angeles\nTemperature: 30°C\nFeels Like: 32°C\nHumidity: 50%\nDescription: Sunny");
        weatherMap.put("Chicago", "Location: Chicago\nTemperature: 20°C\nFeels Like: 19°C\nHumidity: 70%\nDescription: Cloudy");
        weatherMap.put("Andaman and Nicobar Islands - Port Blair", "Location: Port Blair\nTemperature: 30°C\nFeels Like: 32°C\nHumidity: 80%\nDescription: Warm and humid");
        weatherMap.put("Andhra Pradesh - Hyderabad", "Location: Hyderabad\nTemperature: 30°C\nFeels Like: 31°C\nHumidity: 60%\nDescription: Warm and sunny");
        weatherMap.put("Arunachal Pradesh - Itanagar", "Location: Itanagar\nTemperature: 25°C\nFeels Like: 24°C\nHumidity: 80%\nDescription: Cool and cloudy");
        weatherMap.put("Assam - Guwahati", "Location: Guwahati\nTemperature: 29°C\nFeels Like: 30°C\nHumidity: 85%\nDescription: Warm and humid");
        weatherMap.put("Bihar - Patna", "Location: Patna\nTemperature: 32°C\nFeels Like: 33°C\nHumidity: 70%\nDescription: Warm with scattered clouds");
        weatherMap.put("Chandigarh - Chandigarh", "Location: Chandigarh\nTemperature: 32°C\nFeels Like: 33°C\nHumidity: 55%\nDescription: Warm with clear skies");
        weatherMap.put("Chhattisgarh - Raipur", "Location: Raipur\nTemperature: 33°C\nFeels Like: 34°C\nHumidity: 60%\nDescription: Hot and sunny");
        weatherMap.put("Dadra and Nagar Haveli and Daman and Diu - Daman", "Location: Daman\nTemperature: 32°C\nFeels Like: 33°C\nHumidity: 75%\nDescription: Warm and humid");
        weatherMap.put("Delhi - Delhi", "Location: Delhi\nTemperature: 35°C\nFeels Like: 36°C\nHumidity: 55%\nDescription: Hot and sunny");
        weatherMap.put("Goa - Panaji", "Location: Panaji\nTemperature: 31°C\nFeels Like: 32°C\nHumidity: 80%\nDescription: Warm and humid");
        weatherMap.put("Gujarat - Ahmedabad", "Location: Ahmedabad\nTemperature: 36°C\nFeels Like: 37°C\nHumidity: 45%\nDescription: Very hot and dry");
        weatherMap.put("Haryana - Gurgaon", "Location: Gurgaon\nTemperature: 34°C\nFeels Like: 35°C\nHumidity: 50%\nDescription: Hot and sunny");
        weatherMap.put("Himachal Pradesh - Shimla", "Location: Shimla\nTemperature: 22°C\nFeels Like: 21°C\nHumidity: 75%\nDescription: Cool and cloudy");
        weatherMap.put("Jharkhand - Ranchi", "Location: Ranchi\nTemperature: 28°C\nFeels Like: 29°C\nHumidity: 70%\nDescription: Pleasant with light clouds");
        weatherMap.put("Karnataka - Bangalore", "Location: Bangalore\nTemperature: 28°C\nFeels Like: 27°C\nHumidity: 65%\nDescription: Pleasant with light clouds");
        weatherMap.put("Kerala - Thiruvananthapuram", "Location: Thiruvananthapuram\nTemperature: 30°C\nFeels Like: 32°C\nHumidity: 85%\nDescription: Warm and humid");
        weatherMap.put("Ladakh - Leh", "Location: Leh\nTemperature: 20°C\nFeels Like: 18°C\nHumidity: 40%\nDescription: Cool and clear");
        weatherMap.put("Lakshadweep - Kavaratti", "Location: Kavaratti\nTemperature: 29°C\nFeels Like: 30°C\nHumidity: 85%\nDescription: Warm and humid");
        weatherMap.put("Madhya Pradesh - Bhopal", "Location: Bhopal\nTemperature: 30°C\nFeels Like: 31°C\nHumidity: 65%\nDescription: Warm with clouds");
        weatherMap.put("Maharashtra - Mumbai", "Location: Mumbai\nTemperature: 32°C\nFeels Like: 34°C\nHumidity: 80%\nDescription: Humid and warm");
        weatherMap.put("Manipur - Imphal", "Location: Imphal\nTemperature: 26°C\nFeels Like: 25°C\nHumidity: 75%\nDescription: Cool and cloudy");
        weatherMap.put("Meghalaya - Shillong", "Location: Shillong\nTemperature: 22°C\nFeels Like: 21°C\nHumidity: 80%\nDescription: Cool and misty");
        weatherMap.put("Mizoram - Aizawl", "Location: Aizawl\nTemperature: 24°C\nFeels Like: 23°C\nHumidity: 85%\nDescription: Cool and cloudy");
        weatherMap.put("Nagaland - Kohima", "Location: Kohima\nTemperature: 23°C\nFeels Like: 22°C\nHumidity: 80%\nDescription: Cool and partly cloudy");
        weatherMap.put("Odisha - Bhubaneswar", "Location: Bhubaneswar\nTemperature: 31°C\nFeels Like: 32°C\nHumidity: 70%\nDescription: Warm with scattered clouds");
        weatherMap.put("Puducherry - Puducherry", "Location: Puducherry\nTemperature: 33°C\nFeels Like: 34°C\nHumidity: 75%\nDescription: Warm and humid");
        weatherMap.put("Punjab - Amritsar", "Location: Amritsar\nTemperature: 33°C\nFeels Like: 34°C\nHumidity: 55%\nDescription: Warm and sunny");
        weatherMap.put("Rajasthan - Jaipur", "Location: Jaipur\nTemperature: 34°C\nFeels Like: 35°C\nHumidity: 50%\nDescription: Hot and sunny");
        weatherMap.put("Sikkim - Gangtok", "Location: Gangtok\nTemperature: 20°C\nFeels Like: 19°C\nHumidity: 80%\nDescription: Cool and misty");
        weatherMap.put("Tamil Nadu - Chennai", "Location: Chennai\nTemperature: 34°C\nFeels Like: 36°C\nHumidity: 75%\nDescription: Hot and humid");
        weatherMap.put("Telangana - Hyderabad", "Location: Hyderabad\nTemperature: 30°C\nFeels Like: 31°C\nHumidity: 60%\nDescription: Warm and sunny");
        weatherMap.put("Tripura - Agartala", "Location: Agartala\nTemperature: 29°C\nFeels Like: 30°C\nHumidity: 80%\nDescription: Warm and humid");
        weatherMap.put("Uttar Pradesh - Lucknow", "Location: Lucknow\nTemperature: 31°C\nFeels Like: 32°C\nHumidity: 60%\nDescription: Warm and partly cloudy");
        weatherMap.put("Uttarakhand - Dehradun", "Location: Dehradun\nTemperature: 27°C\nFeels Like: 26°C\nHumidity: 70%\nDescription: Pleasant and clear");
        weatherMap.put("West Bengal - Kolkata", "Location: Kolkata\nTemperature: 33°C\nFeels Like: 34°C\nHumidity: 70%\nDescription: Hot with scattered clouds");
        
    }

    public static String getWeather(String location) {
        return weatherMap.getOrDefault(location, "Weather information not available for this location.");
    }
}
