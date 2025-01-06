package Assignment_2.Assignment_2_1;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        int max = array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);
    }
}
