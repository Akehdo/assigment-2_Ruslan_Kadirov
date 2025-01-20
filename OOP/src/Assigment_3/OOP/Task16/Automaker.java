package Assigment_3.OOP.Task16;

public class Automaker {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.initialize("Sedan", 2025, "Red");

        Car car2 = new Car();
        car2.initialize("SUV", 2023, "Blue");

        Car car3 = new Car();
        car3.initialize("Cabriolet", 2024, "Black");


        System.out.println("Car1 Model: " + car1.getModel());
        System.out.println("Car1 Year: " + car1.getYear());
        System.out.println("Car1 Color: " + car1.getColor());
    }
}
