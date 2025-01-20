package Assignment_2.Assignment_2_1;

import java.util.Scanner;

public class Task_7 {
    public static String[] array = new String[6];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }

        boolean[] toRemove = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        toRemove[i] = true;
                        toRemove[j] = true;
                    }
                }
            }






        }


        for (int i = 0; i < array.length; i++) {
            if (toRemove[i]) {
                array[i] = null;
            }
        }

        for (String str : array) {
            System.out.print(str + ", ");
        }
    }
}
