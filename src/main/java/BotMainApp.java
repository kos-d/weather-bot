
import config.BotConfig;
import exceptions.IncorrectCityNameException;
import model.Weather;
import service.WeatherService;
import service.impl.FakeWeatherServiceImpl;
import service.impl.WeatherServiceImpl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BotMainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BotConfig.class);
        WeatherServiceImpl weatherService = annotationConfigApplicationContext.getBean(WeatherServiceImpl.class);
                                
//        AnnotationConfigApplicationContext
                
//        WeatherService weatherService = new FakeWeatherServiceImpl();
//        WeatherService weatherService = new WeatherServiceImpl();

        Weather info;
        info = weatherService.getByCityName("Kharkiv");
//        info = weatherService.getByCityName("Kiev");
//        info = weatherService.getByCityName("Lviv");
//        info = weatherService.getByCityName("Odessa");
//        info = weatherService.getByCityName("Mariupol");

        try {
            System.out.println(info);

        } catch (IncorrectCityNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
