package Assigment_3.Interfaces.Task11;

public class Dog implements Movable, Eatable{
    @Override
    public void eat() {
        System.out.println("Dog is eating ");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving ");
    }
}
