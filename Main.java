import java.util.Scanner;
class WeatherService {
    public String getWeather(String location) {
        return WeatherData.getWeather(location);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherService weatherService = new WeatherService();

        System.out.println("Enter a Location:");
        String location = scanner.nextLine();

        String weatherInfo = weatherService.getWeather(location);
        System.out.println(weatherInfo);

        scanner.close();
    }
}
