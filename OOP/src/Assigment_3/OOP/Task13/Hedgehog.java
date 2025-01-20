package Assigment_3.OOP.Task13;

public class Hedgehog {

    public static void main(String[] args) {
        Apple apple = new Apple();

        Hedgehog hedgehog = new Hedgehog();

        hedgehog.eat(apple);
    }

    public void eat(Apple apple) {
        System.out.println("The apple has been eaten!");
    }

    public static class Apple {
    }
}

