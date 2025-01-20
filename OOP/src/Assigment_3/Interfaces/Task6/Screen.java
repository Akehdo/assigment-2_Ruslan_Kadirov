package Assigment_3.Interfaces.Task6;

public class Screen implements Selectable, Updatable {
    @Override
    public void onSelect() {
        System.out.println("Screen selected ...");
    }

    @Override
    public void refresh() {
        System.out.println("Screen refreshed ...");
    }
}
