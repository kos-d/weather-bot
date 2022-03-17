package service;

public final class ApiConstants {
    
    public static final String CITY_REGEX = "^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";
    public static final String GET_WEATHER_BY_CITY_URL = "https://api.weatherbit.io/v2.0/current?city=";
    public static final String API_KEY_PARAM = "&key=";
    
    public static final int OK_STATUS_CODE = 200;
    public static final int NOT_FOUND_STATUS_CODE = 404;
    
    
    
//    public static final String URI_WEATHER = "https://api.weatherbit.io/v2.0/current?city=Kharkiv&lang=ua&key=79af7cb7f4ca4f1cb245d1d1c918b465";
//    public static final String URI_WEATHER = "https://api.weatherbit.io/v2.0/current?city=Kiev&lang=ua&key=79af7cb7f4ca4f1cb245d1d1c918b465";
    
    private ApiConstants() {
        
    }
}