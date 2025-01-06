package Assignment_2.Assignment_2_1;

import java.util.Scanner;

public class Task_14 {
    public static int[][] matrix = new int[3][3];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rowIndex = 0;
        int colIndex = 0;
        int[] columnSums = new int[3];
        int[] rowSums = new int[3];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextInt();
                rowSums[rowIndex] += matrix[row][col];
                columnSums[colIndex] += matrix[row][col];
                colIndex++;
            }
            rowIndex++;
            colIndex = 0;
        }


        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < columnSums.length; i++) {
            if (columnSums[i] > maxSum) {
                maxSum = columnSums[i];
            }
            if (rowSums[i] > maxSum) {
                maxSum = rowSums[i];
            }
        }

        System.out.println(maxSum);
    }
}
