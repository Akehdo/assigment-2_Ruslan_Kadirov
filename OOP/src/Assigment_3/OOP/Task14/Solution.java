package Assigment_3.OOP.Task14;

public class Solution {

    public static void main(String[] args) {
        City city = new City("Dubai", 40);

        showWeather(city);
    }

    public static void showWeather(City city) {
        System.out.printf("In the city \"%s\" today the air temperature is %d%n", city.getName(), city.getTemperature());
    }

}
