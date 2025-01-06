package Assignment_1.Assignment_1_2;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        //object scanner of class Scanner
        Scanner scanner = new Scanner(System.in);

        //input variables from keyboard
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0; //variable for sum



        for(int i = start; i < end; i++){// sum of numbers from start (inclusive) to end (not inclusive),
            if(i%multiple == 0){//multiples of multiple, is displayed on the screen.
                sum += i; // sum every iteration
            }
        }

        System.out.println(sum); //output sum

    }
}
