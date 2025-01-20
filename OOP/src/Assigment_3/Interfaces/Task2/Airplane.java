package Assigment_3.Interfaces.Task2;

public class Airplane implements Moveable, Flyable {
    @Override
    public void fly() {
        System.out.println("Plane is flying ...");
    }

    @Override
    public void move() {
        System.out.println("Plane is moving ...");
    }
}
