package Assigment_3.Interfaces.Task2;

public class Duck implements Flyable, Moveable, Eatable {
    @Override
    public void eat() {
        System.out.println("Duck is eating ...");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying ...");
    }

    @Override
    public void move() {
        System.out.println("Duck is moving ...");
    }
}
