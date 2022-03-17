package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Weather {

    private String city_name;
    private String country_code;
    private double temp;

//    public Weather(String city_name, String country_code, double temp) {
//        this.city_name = city_name;
//        this.country_code = country_code;
//        this.temp = temp;
//    }

//    public Weather() {
//    }

//    public String getCity_name() {
//        return city_name;
//    }
//
//    public void setCity_name(String city_name) {
//        this.city_name = city_name;
//    }
//
//    public String getCountry_code() {
//        return country_code;
//    }
//
//    public void setCountry_code(String country_code) {
//        this.country_code = country_code;
//    }
//
//    public double getTemp() {
//        return temp;
//    }
//
//    public void setTemp(double temp) {
//        this.temp = temp;
//    }
//
//    @Override
//    public String toString() {
//        return "Weather{" + "city_name=" + city_name + ", country_code=" + country_code + ", temp=" + temp + '}';
//    }
    
}
