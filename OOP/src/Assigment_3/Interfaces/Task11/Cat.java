package Assigment_3.Interfaces.Task11;

public class Cat implements Eatable, Edible, Movable{
    @Override
    public void eat() {
        System.out.println("cat is eating");
    }

    @Override
    public void beAte() {
        System.out.println("cat was ate by someone");
    }

    @Override
    public void move() {
        System.out.println("cat is moving");
    }
}
