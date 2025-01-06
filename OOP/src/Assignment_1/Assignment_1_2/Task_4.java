package Assignment_1.Assignment_1_2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        //object scanner of class Scanner
        Scanner scanner = new Scanner(System.in);

        //read from keyboard age of person
        int age = scanner.nextInt();

        //condition for check if person have to work
        if(age<=20 || age>=60) {
            System.out.println("you don’t have to work.");
        }
    }
}
