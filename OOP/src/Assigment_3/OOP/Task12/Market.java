package Assigment_3.OOP.Task12;

public class Market {
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean localHasEggs = false;
        makePurchases(localHasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (Market.hasEggs) {
            System.out.println("Bought 10 loaves");
        } else {
            System.out.println("Bought 1 loaf");
        }
    }
}

