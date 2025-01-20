package Assigment_3.Interfaces.Task15;

public class Screen implements Selectable, Updatable{
    @Override
    public void select() {
        System.out.println("Screen selected");
    }

    @Override
    public void update() {
        System.out.println("Screen updated");
    }
}
