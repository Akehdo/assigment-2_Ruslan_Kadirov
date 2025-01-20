package Assigment_3.Interfaces.Task5;

public class BeerLover implements Alcoholic{
    @Override
    public void sleepOnTheFloor() {
        System.out.println("sleeping on the floor");
    }

    @Override
    public void askForMore(String message) {
        System.out.println("Asking for" + message);
    }

    @Override
    public void sayThankYou() {
        System.out.println("Thank you ");
    }

    @Override
    public boolean isReadyToGoHome() {
        return false;
    }
}
