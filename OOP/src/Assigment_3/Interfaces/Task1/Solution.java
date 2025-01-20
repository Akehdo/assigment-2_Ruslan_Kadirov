package Assigment_3.Interfaces.Task1;

public class Solution implements Flyable {
    @Override
    public void fly() {
        System.out.println("flying ...");
    }

    @Override
    public void land() {
        System.out.println("landing ...");
    }
}
