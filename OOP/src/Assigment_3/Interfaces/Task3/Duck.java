package Assigment_3.Interfaces.Task3;

public class Duck implements Swimable, Flyable, Runnable {
    @Override
    public void fly() {
        System.out.println("Duck is flying ...");
    }

    @Override
    public void run() {
        System.out.println("Duck is running ...");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming ...");
    }
}
