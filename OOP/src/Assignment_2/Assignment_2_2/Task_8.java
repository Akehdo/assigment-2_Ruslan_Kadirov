package Assignment_2.Assignment_2_2;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(cube(n));
    }

    public static long cube(long number) {
        return number * number * number;
    }
}
