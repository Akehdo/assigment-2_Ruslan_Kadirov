package Assigment_3.OOP.Task4;

import java.util.Calendar;

public class CarConcern {

    public static void main(String[] args) {
        CarConcern car1 = new CarConcern("Cayenne", 2023, "Red");
        CarConcern car2 = new CarConcern("911", 2022);
        CarConcern car3 = new CarConcern("Taycan");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }

    @Override
    public String toString() {
        return String.format("Manufacturer: %s, Model: %s, Year: %d, Color: %s", manufacturer, model, year, color);
    }

    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Orange";
    }

    public CarConcern(String model) {
        this.model = model;
        this.year = Calendar.getInstance().get(Calendar.YEAR);
        this.color = "Orange";
    }


}
