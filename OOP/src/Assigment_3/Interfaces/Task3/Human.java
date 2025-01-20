package Assigment_3.Interfaces.Task3;

public class Human implements Runnable, Swimable {
    @Override
    public void run() {
        System.out.println("Human is running ...");
    }

    @Override
    public void swim() {
        System.out.println("Human is swimming ...");
    }
}
