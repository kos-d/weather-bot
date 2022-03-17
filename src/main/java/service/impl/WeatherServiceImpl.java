package service.impl;

import java.io.IOException;
import java.net.URI;
import model.Weather;
import service.WeatherService;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import lombok.SneakyThrows;
import static service.ApiConstants.GET_WEATHER_BY_CITY_URL;
import com.google.gson.Gson;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import static service.ApiConstants.API_KEY_PARAM;

@Service    // init this class how bean
public class WeatherServiceImpl implements WeatherService {
    
    @Value("${api.key}")
    private String apiKey;

    @SneakyThrows // no try catch
    @Override
    public Weather getByCityName(String city) {
        validateCityName(city);
        Gson gson = new Gson();

        HttpClient httpClient = HttpClient.newBuilder()
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(GET_WEATHER_BY_CITY_URL + city + API_KEY_PARAM + apiKey))
                .build();
//        try {
//            HttpResponse<String> response;
//            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//            WeatherResponse weathers;
//            weathers = gson.fromJson(response.body(), WeatherResponse.class);
//            System.out.println(Arrays.toString(weathers.data));
//            System.out.println(response.body());
//        } catch (IOException | InterruptedException e) {
//            System.out.println(e);
//        }
        
//        return null;

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        WeatherResponse weathers = gson.fromJson(response.body(), WeatherResponse.class);

//        System.out.println(Arrays.toString(weathers.data));
//        System.out.println(weathers.data[0]);
        
//        System.out.println(response.body());
            return weathers.data[0];
//        throw new UnsupportedOperationException("Not supported yet.");

    }
    class WeatherResponse {
        Weather [] data;
    }
}
