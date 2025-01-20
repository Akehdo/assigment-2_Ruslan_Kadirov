package Assigment_3.Interfaces.Task3;

public class Penguin implements Runnable, Swimable {
    @Override
    public void run() {
        System.out.println("Penguin is running ...");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming ...");
    }
}
