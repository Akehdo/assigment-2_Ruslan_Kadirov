package Assignment_1.Assignment_1_2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();

        for (int i = rows; i >= 0; i--) {

            for (int j = 0; j <= rows - i ; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= 2 * i-1; k++){
                System.out.print("8");
            }

            System.out.println(" ");
        }

        for (int i = 1; i <= rows; i++) {

            for (int j = 0; j <= rows - i ; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= 2 * i-1; k++){
                System.out.print("8");
            }

            System.out.println(" ");
        }
    }
}