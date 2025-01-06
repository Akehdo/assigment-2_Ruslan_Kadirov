package Assignment_2.Assignment_2_2;

public class Task_6 {
    public static void main(String[] args) {
        universalMethod();
        universalMethod(5);
        universalMethod("Hello");
        universalMethod(3.14);
        universalMethod(true);
        universalMethod(10, 20);
        universalMethod("Hello", 3);
        universalMethod(new int[]{1, 2, 3});
        universalMethod(7, 8, 9);
        universalMethod(2.5, "World");
    }

    public static void universalMethod() {
        System.out.println("No parameters method called.");
    }

    public static void universalMethod(int a) {
        System.out.println("Integer method called with value: " + a);
    }

    public static void universalMethod(String str) {
        System.out.println("String method called with value: " + str);
    }

    public static void universalMethod(double d) {
        System.out.println("Double method called with value: " + d);
    }


    public static void universalMethod(boolean flag) {
        System.out.println("Boolean method called with value: " + flag);
    }

    public static void universalMethod(int a, int b) {
        System.out.println("Two integers method called with values: " + a + " and " + b);
    }


    public static void universalMethod(String str, int a) {
        System.out.println("String and Integer method called with values: " + str + " and " + a);
    }


    public static void universalMethod(int[] arr) {
        System.out.print("Array method called with values: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void universalMethod(int a, int b, int c) {
        System.out.println("Three integers method called with values: " + a + ", " + b + ", and " + c);
    }

    public static void universalMethod(double d, String str) {
        System.out.println("Double and String method called with values: " + d + " and " + str);
    }
}
