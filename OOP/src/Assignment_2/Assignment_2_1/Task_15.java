package Assignment_2.Assignment_2_1;

import java.util.Scanner;

public class Task_15 {
    public static int[][] matrix = new int[3][3];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tempValue = 0;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                matrix[row][col] = input.nextInt();
            }
        }

        for (int row = 0; row < 3; row++) {
            for (int col = row; col < 3; col++) {
                tempValue = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = tempValue;
            }
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
