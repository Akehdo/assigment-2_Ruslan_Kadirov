package Assignment_1.Assignment_1_2;

import java.util.Scanner;//import class Scanner from java.util

public class Task_3 {
    public static void main(String[] args) {
        //// sc = object of class Scanner
        Scanner sc = new Scanner(System.in);

        //message for users
        System.out.print("Enter body temperature: ");

        //read body temperature from keyboard
        double temperature = sc.nextDouble();

        //bolean variables for next if statement
        boolean isHigh = temperature > 37.0;
        boolean isLow = temperature < 36.0;

        //condition for check body temperature
        if (isHigh) {
            System.out.println("Temperature is high.");
        } else if (isLow) {
            System.out.println("Temperature is low");
        } else {
            System.out.println("Temperature is normal");
        }
    }
}
