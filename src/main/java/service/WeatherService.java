package service;

import model.Weather;
import static service.ApiConstants.CITY_REGEX;
import exceptions.IncorrectCityNameException;

public interface WeatherService {
    
    Weather getByCityName(String city);
    
    default void validateCityName(String city) {
        
        if (!city.matches(CITY_REGEX)) {
            throw new IncorrectCityNameException(String.format("Incorrect city name %s", city));
        }
    }
}
