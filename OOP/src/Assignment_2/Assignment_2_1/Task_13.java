package Assignment_2.Assignment_2_1;

import java.util.Scanner;

public class Task_13 {
    public static int[][] array = new int[2][3];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter a non-zero integer:");
                int value = scanner.nextInt();
                while (value == 0) {
                    System.out.println("Enter a non-zero integer:");
                    value = scanner.nextInt();
                }
                array[i][j] = value;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
