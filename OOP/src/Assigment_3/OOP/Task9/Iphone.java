package Assigment_3.OOP.Task9;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Iphone iphone = (Iphone) obj;

        if (price != iphone.price) return false;
        if (!model.equals(iphone.model)) return false;
        return color.equals(iphone.color);
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + price;
        return result;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);
        System.out.println(iphone1.equals(iphone2));
    }
}
