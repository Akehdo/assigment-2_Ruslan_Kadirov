package Assigment_3.Interfaces.Task2;

public class Dog implements Moveable,Eatable {
    @Override
    public void eat() {
        System.out.println("dog is eating ...");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving ...");
    }
}
