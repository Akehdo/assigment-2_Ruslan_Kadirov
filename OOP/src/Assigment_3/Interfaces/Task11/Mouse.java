package Assigment_3.Interfaces.Task11;

public class Mouse implements Movable, Edible {
    @Override
    public void beAte() {
        System.out.println("Mouse was ate by someone");
    }


    @Override
    public void move() {
        System.out.println("Mouse is moving");
    }
}
